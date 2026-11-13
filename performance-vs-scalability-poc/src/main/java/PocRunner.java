
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PocRunner {

    public static void main(String[] args) throws InterruptedException {
        ServicoSimulado servico = new ServicoSimulado();
        int totalUsuariosSimultaneos = 10;

        System.out.println("=================================================================");
        System.out.println("===       INICIANDO POC: PERFORMANCE VS ESCALABILIDADE        ===");
        System.out.println("=================================================================\n");

        // CENÁRIO 1: Baseline (1 usuário, código lento)
        executarCenario("1. Baseline (1 Usuário | Código Lento)", 1, 1, () -> {
            servico.processarTarefaLenta(1);
            return null;
        });

        // CENÁRIO 2: Foco em PERFORMANCE (1 usuário, código otimizado)
        // Reduzimos o tempo de resposta individual (Latência de 500ms -> 100ms).
        executarCenario("2. Ganho de PERFORMANCE (1 Usuário | Código Otimizado)", 1, 1, () -> {
            servico.processarTarefaOtimizada(1);
            return null;
        });

        // CENÁRIO 3: Problema de ESCALABILIDADE (10 usuários, apenas 1 thread/recurso)
        // Mesmo com o código otimizado (100ms), a falta de recursos cria uma fila sequencial.
        executarCenario("3. Falha de ESCALABILIDADE (10 Usuários | 1 Thread | Código Otimizado)",
                totalUsuariosSimultaneos, 1, () -> {
                    servico.processarTarefaOtimizada(1);
                    return null;
                });

        // CENÁRIO 4: Ganho de ESCALABILIDADE (10 usuários, 10 threads/recursos)
        // Adicionamos capacidade (Scale Up/Out) para lidar com a concorrência.
        executarCenario("4. Alta ESCALABILIDADE (10 Usuários | 10 Threads | Código Otimizado)",
                totalUsuariosSimultaneos, 10, () -> {
                    servico.processarTarefaOtimizada(1);
                    return null;
                });

        System.out.println("=== CENÁRIOS EXTRAS / DESAFIOS DO GUIA ===\n");

        // CENÁRIO 5 (Desafio 1): Recurso Compartilhado com Contenção/Lock (synchronized)
        // Mesmo tendo 10 threads, todas competem pelo mesmo lock exclusivo no método.
        executarCenario("5. Desafio: Contenção de Lock (10 Usuários | 10 Threads | Código Sincronizado)",
                totalUsuariosSimultaneos, 10, () -> {
                    servico.processarTarefaComLock(1);
                    return null;
                });

        // CENÁRIO 6 (Desafio 2): Escalabilidade com Virtual Threads (Java 21+)
        // Testando alta concorrência (ex: 1.000 requisições simultâneas em I/O bound)
        int usuariosVirtualThreads = 1000;
        executarCenarioComExecutor(
                "6. Desafio: Virtual Threads (" + usuariosVirtualThreads + " Usuários | Virtual Threads | Código Otimizado)",
                usuariosVirtualThreads,
                Executors.newVirtualThreadPerTaskExecutor(),
                () -> {
                    servico.processarTarefaOtimizada(1);
                    return null;
                }
        );

        System.out.println("=== FIM DA EXECUÇÃO DA POC ===");
    }

    private static void executarCenario(String nomeCenario, int qtdRequisicoes, int tamanhoPoolThreads, Callable<Void> tarefa)
            throws InterruptedException {
        executarCenarioComExecutor(nomeCenario, qtdRequisicoes, Executors.newFixedThreadPool(tamanhoPoolThreads), tarefa);
    }

    private static void executarCenarioComExecutor(String nomeCenario, int qtdRequisicoes, ExecutorService executor, Callable<Void> tarefa)
            throws InterruptedException {

        System.out.println(">> Executando: " + nomeCenario);

        List<Callable<Void>> tarefas = new ArrayList<>(qtdRequisicoes);
        for (int i = 0; i < qtdRequisicoes; i++) {
            tarefas.add(tarefa);
        }

        Instant inicio = Instant.now();

        // Dispara todas as requisições simultaneamente e aguarda todas terminarem
        executor.invokeAll(tarefas);

        Instant fim = Instant.now();
        executor.shutdown();

        long tempoTotalMs = Duration.between(inicio, fim).toMillis();
        double throughput = (double) qtdRequisicoes / (Math.max(tempoTotalMs, 1) / 1000.0);

        System.out.printf("   Tempo Total (Latência do lote): %d ms%n", tempoTotalMs);
        System.out.printf("   Vazão (Throughput): %.2f requisições/segundo%n", throughput);
        System.out.println("-----------------------------------------------------------------\n");
    }
}
