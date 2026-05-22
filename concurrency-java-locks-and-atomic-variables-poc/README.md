# Java Concurrency - Locks and Atomic Variables POC

POC desenvolvida em Java 21 com o objetivo de praticar os principais conceitos de sincronização, locks e variáveis atômicas em aplicações concorrentes.

## Conceitos praticados

Durante esta POC foram estudados os seguintes recursos:

- Race Condition
- `synchronized`
- `ReentrantLock`
- `ReadWriteLock`
- `AtomicInteger`
- `LongAdder`
- `compareAndSet`
- `volatile`
- Deadlock Simulation
- Thread Safety

## Objetivos da POC

A POC demonstrou como:

- Trabalhar com concorrência entre múltiplas threads
- Evitar problemas de race condition
- Utilizar mecanismos de sincronização
- Implementar locks explícitos
- Trabalhar com operações atômicas
- Melhorar performance concorrente com `LongAdder`
- Utilizar `compareAndSet` para operações lock-free
- Garantir visibilidade entre threads com `volatile`
- Simular cenários de deadlock
- Controlar acesso de leitura e escrita com `ReadWriteLock`

## Principais conceitos aprendidos

| Recurso | Objetivo |
|---|---|
| `synchronized` | Sincronização implícita |
| `ReentrantLock` | Controle explícito de lock |
| `ReadWriteLock` | Múltiplos leitores e único escritor |
| `AtomicInteger` | Operações atômicas |
| `LongAdder` | Contador performático para alta concorrência |
| `compareAndSet` | Atualização lock-free |
| `volatile` | Visibilidade entre threads |
| Deadlock | Simulação de bloqueio entre threads |

## Tecnologias

- Java 21

## Referências

- https://towardsdev.com/locks-and-atomic-variables-in-java-a4434389e7ad
- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/package-summary.html
- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html
- https://www.baeldung.com/java-concurrent-locks