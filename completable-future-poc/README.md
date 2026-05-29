# # Java Concurrency - CompletableFuture POC

POC desenvolvida para estudar concorrência assíncrona em Java utilizando `CompletableFuture`.

## Conceitos praticados

- `CompletableFuture`
- `runAsync()`
- `supplyAsync()`
- `thenApply()`
- `thenAccept()`
- `thenRun()`
- `thenCombine()`
- `allOf()`
- `anyOf()`
- `exceptionally()`
- `handle()`
- `join()`
- Processamento assíncrono
- Execução paralela de tarefas

## Objetivos da POC

- Entender como executar tarefas assíncronas em Java
- Aprender a trabalhar com pipelines assíncronos
- Explorar composição e combinação de tarefas
- Praticar tratamento de exceções em operações assíncronas
- Simular cenários comuns de concorrência moderna

## Principais conceitos aprendidos

- Como criar tarefas assíncronas com `runAsync()` e `supplyAsync()`
- Como transformar resultados utilizando `thenApply()`
- Como consumir resultados utilizando `thenAccept()`
- Como executar ações após conclusão com `thenRun()`
- Como combinar múltiplos `CompletableFuture`
- Como aguardar múltiplas tasks utilizando `allOf()`
- Como obter a primeira resposta disponível utilizando `anyOf()`
- Como implementar fallback com `exceptionally()`
- Como tratar sucesso e erro utilizando `handle()`
- Como aguardar conclusão das tasks com `join()`

## Tecnologias

- Java 21

## Referências

- https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
- https://www.baeldung.com/java-completablefuture
- https://www.baeldung.com/java-completablefuture-threadpool