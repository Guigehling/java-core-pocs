# Java Concurrency - Callable and Future POC

POC desenvolvida em Java 21 com o objetivo de praticar os principais conceitos de execução assíncrona utilizando `Callable` e `Future`.

## Conceitos praticados

Durante esta POC foram estudados os seguintes recursos:

- `Callable`
- `Future`
- `submit`
- `get`
- `isDone`
- `cancel`
- `Timeout`
- `ExecutorService`
- Thread Pool
- Execução assíncrona

## Objetivos da POC

A POC demonstrou como:

- Executar tarefas assíncronas com retorno
- Trabalhar com processamento concorrente
- Obter resultados futuros utilizando `Future`
- Monitorar o estado de execução de tasks
- Definir timeout para operações assíncronas
- Cancelar tarefas em execução
- Gerenciar threads utilizando `ExecutorService`

## Principais conceitos aprendidos

| Recurso | Objetivo |
|---|---|
| `Callable<T>` | Task com retorno |
| `Future<T>` | Resultado futuro da task |
| `submit()` | Envio da task para execução |
| `get()` | Recuperação do resultado |
| `isDone()` | Verifica conclusão da task |
| `cancel()` | Cancela execução |
| `Timeout` | Limita tempo de espera |

## Tecnologias

- Java 21

## Referências

- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html
- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html
- https://medium.com/@vinciabhinav7/concurrency-in-java-executorservice-future-and-callable-f22a7fbeefe2