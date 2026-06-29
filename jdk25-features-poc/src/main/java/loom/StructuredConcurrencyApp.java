import java.util.concurrent.StructuredTaskScope.Subtask;

void main() {
    IO.println("=== INICIANDO POC - JDK 25 - JEP 505 ===");

    // =========================================
    // SCENARIO 1: SUCCESS FLOW
    // =========================================
    IO.println("--- Cenário 1: Execução Paralela com Sucesso ---");
    executarFluxoFechamentoPedido(false);

    // =========================================
    // SCENARIO 2: FAIL FLOW (SHORT-CIRCUIT)
    // =========================================
    IO.println("--- Cenário 2: Falha Rápida (Cancelamento Automático das demais) ---");
    executarFluxoFechamentoPedido(true);
}

private static void executarFluxoFechamentoPedido(boolean forcarErroFrete) {
    Instant inicio = Instant.now();

    // =========================================
    // INITIALIZE STRUCTURED TASK SCOPE
    // =========================================
    try (var scope = StructuredTaskScope.open()) {

        // =========================================
        // CREATE TASKS (FORK)
        // =========================================
        IO.println("[ESCOPO] Disparando subtarefas através de Virtual Threads...");

        Subtask<String> tarefaEstoque = scope.fork(() -> consultarEstoque());
        Subtask<Double> tarefaFrete = scope.fork(() -> calcularFrete(forcarErroFrete));
        Subtask<Boolean> tarefaCupom = scope.fork(() -> validarCupom());

        // =========================================
        // JOIN SUBTASKS & VALIDATE RESULTS
        // =========================================
        // No JDK 25, se qualquer subtarefa falhar, o .join() lança uma FailedException automaticamente.
        scope.join();

        // =========================================
        // PROCESS SUCCESS DATA
        // =========================================
        // Se o join() passou sem lançar exceção, todas as tarefas terminaram com sucesso.
        long tempoGasto = Duration.between(inicio, Instant.now()).toMillis();
        IO.println("[SUCESSO] Dados consolidados com sucesso em " + tempoGasto + "ms!");
        IO.println("  -> Resultado Estoque: " + tarefaEstoque.get());
        IO.println("  -> Resultado Frete  : R$ " + tarefaFrete.get());
        IO.println("  -> Cupom Válido?    : " + tarefaCupom.get());

    } catch (Exception e) {
        // =========================================
        // ERROR HANDLING & VERIFICATION
        // =========================================
        // O bloco catch captura a FailedException lançada pelo próprio scope.join()
        long tempoGasto = Duration.between(inicio, Instant.now()).toMillis();
        System.err.println("[ERRO CAPTURADO] O escopo interrompeu a execução após " + tempoGasto + "ms!");
        System.err.println("  -> Causa Real: " + e.getMessage());
    }
}

// =========================================
// MOCK SERVICES
// =========================================
private static String consultarEstoque() throws InterruptedException {
    Thread.sleep(300);
    IO.println("  [LOG] [" + Thread.currentThread().getName() + "] Estoque verificado: PRODUTO DISPONÍVEL.");
    return "Disponível (Qtd: 5)";
}

private static double calcularFrete(boolean forcarErro) throws InterruptedException {
    Thread.sleep(500);
    if (forcarErro) {
        IO.println("  [LOG] [" + Thread.currentThread().getName() + "] Falha crítica na API de Frete!");
        throw new RuntimeException("API de Frete indisponível.");
    }
    IO.println("  [LOG] [" + Thread.currentThread().getName() + "] Frete calculado.");
    return 22.90;
}

private static boolean validarCupom() throws InterruptedException {
    // Esta tarefa simula um processo mais lento (1.5 segundos)
    Thread.sleep(1500);
    IO.println("  [LOG] [" + Thread.currentThread().getName() + "] Cupom validado.");
    return true;
}