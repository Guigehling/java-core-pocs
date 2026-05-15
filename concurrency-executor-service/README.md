# Java Concurrency - ExecutorService POC

POC desenvolvida em Java 21 com o objetivo de praticar os principais conceitos de concorrência utilizando `ExecutorService` e `ScheduledExecutorService`.

## Conceitos praticados

Durante esta POC foram estudados os seguintes recursos:

- `ExecutorService`
- `Thread Pool`
- `Runnable`
- `Callable`
- `Future`
- `submit`
- `invokeAll`
- `invokeAny`
- `ScheduledExecutorService`
- `schedule`
- `scheduleAtFixedRate`
- `scheduleWithFixedDelay`
- `shutdown`

## Objetivos da POC

A POC demonstrou como:

- Executar tarefas assíncronas
- Trabalhar com múltiplas threads
- Utilizar pools de threads
- Executar tarefas com e sem retorno
- Processar tarefas concorrentes em lote
- Obter o primeiro resultado disponível entre múltiplas tasks
- Agendar execuções futuras e periódicas
- Gerenciar o ciclo de vida das threads

## Principais conceitos aprendidos

| Recurso | Objetivo |
|---|---|
| `Runnable` | Execução sem retorno |
| `Callable` | Execução com retorno |
| `Future` | Resultado assíncrono |
| `invokeAll` | Executa todas as tasks |
| `invokeAny` | Retorna a primeira task concluída |
| `schedule` | Executa uma vez após delay |
| `scheduleAtFixedRate` | Execução periódica fixa |
| `scheduleWithFixedDelay` | Execução periódica com espera |

## Tecnologias

- Java 21

## Referências

- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html
- https://www.baeldung.com/java-executor-service-tutorial