
public class ServicoSimulado {

    /**
     * Simula uma tarefa com BAIXA performance (demora 500ms por requisição).
     */
    public String processarTarefaLenta(int idUsuario) {
        simularTrabalhoPesado(500);
        return "Usuário " + idUsuario + " processado (Modo Lento)";
    }

    /**
     * Simula uma tarefa com ALTA performance (otimizada, demora 100ms por requisição).
     */
    public String processarTarefaOtimizada(int idUsuario) {
        simularTrabalhoPesado(100);
        return "Usuário " + idUsuario + " processado (Modo Rápido)";
    }

    /**
     * Desafio 1: Simula uma tarefa com alta performance individual (100ms),
     * porém com bloqueio/contenção de recurso compartilhado (synchronized).
     * Isso demonstra que ter mais threads não escala se houver um lock exclusivo.
     */
    public synchronized String processarTarefaComLock(int idUsuario) {
        simularTrabalhoPesado(100);
        return "Usuário " + idUsuario + " processado (Modo Bloqueado/Lock)";
    }

    private void simularTrabalhoPesado(long milissegundos) {
        try {
            // Simula o tempo gasto em processamento ou I/O
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
