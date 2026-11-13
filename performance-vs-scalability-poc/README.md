# Performance vs. Escalabilidade POC

POC desenvolvida para demonstrar e analisar na prática a diferença fundamental entre Performance (latência) e Escalabilidade (throughput e concorrência) utilizando Java.

## Conceitos praticados

- Performance (Desempenho e Latência)
- Escalabilidade (Throughput e Vazão)
- Concorrência e Multithreading
- Pools de Threads (`ExecutorService` / `FixedThreadPool`)
- Gargalo de Recursos e Enfileiramento de Requisições
- Contenção de Recursos Compartilhados (`synchronized` / Locks)
- Virtual Threads (Project Loom - Java 21+)
- Métricas de Latência de Lote e Requisições por Segundo

## Objetivos da POC

- Diferenciar conceitual e praticamente Performance de Escalabilidade
- Demonstrar o impacto da otimização de tempo de resposta individual (redução de latência)
- Simular o comportamento de um sistema sob concorrência com recursos limitados
- Observar como a adição de recursos (threads) viabiliza a escalabilidade do sistema
- Evidenciar o impacto negativo de travas em recursos compartilhados (locks/contenção) na capacidade de escala
- Avaliar a escalabilidade massiva de Virtual Threads em cenários I/O bound

## Principais conceitos aprendidos

- Performance foca no tempo gasto para atender uma única requisição (redução de latência).
- Escalabilidade foca na capacidade do sistema manter o tempo de resposta estável ao aumentar a carga de usuários simultâneos adicionando recursos.
- Um sistema pode ter alta performance para um único usuário, mas baixa escalabilidade quando múltiplos usuários acessam simultaneamente devido à fila de espera por recursos.
- Aumentar recursos (ex: pool de threads) eleva a vazão (*throughput*) apenas se não houver pontos de bloqueio centralizados.
- Contenções em recursos compartilhados (`synchronized`, locks exclusivos ou filas em banco de dados) criam gargalos sequenciais que anulam os ganhos de múltiplas threads.
- Virtual Threads (Java 21+) eliminam o alto custo de memória e troca de contexto das *platform threads*, permitindo milhares de operações I/O simultâneas com excelente tempo de resposta e alta vazão.

## Tecnologias

- Java 21+
- Apache Maven

## Vantagens e Desvantagens

### Vantagens

- Demonstração empírica e didática com dados comparáveis de tempo e vazão no console.
- Implementação em Java puro da API de concorrência (`java.util.concurrent`), sem dependência de bibliotecas externas pesadas.
- Rápida execução com cenários isolados cobrindo desde o caso base até concorrência massiva com Virtual Threads.
- Facilidade para simular gargalos reais de arquitetura (contenção e saturação de pools).

### Desvantagens

- Utiliza `Thread.sleep()` como simplificação de latência de rede/I/O e processamento.
- Não reflete latências dinâmicas de rede real, latência de banco de dados distribuído ou *garbage collection* sob alta pressão de memória.
- Execução em máquina local pode apresentar pequenas variações de tempo decorrentes de outros processos do sistema operacional.

## Referências

- https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html
- https://www.baeldung.com/java-executors-types
- https://www.baeldung.com/cs/scalability-vs-performance
- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/package-summary.html
