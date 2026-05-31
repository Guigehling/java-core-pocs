# Virtual Threads POC

POC desenvolvida para estudar Virtual Threads introduzidas pelo Project Loom e disponibilizadas de forma estável no Java 21.

## Conceitos praticados

- Virtual Threads
- Platform Threads
- Project Loom
- `Thread.startVirtualThread()`
- `Executors.newVirtualThreadPerTaskExecutor()`
- `ExecutorService`
- Concorrência massiva
- HTTP Client (`HttpClient`)
- Comparação de desempenho entre modelos de threading
- Operações bloqueantes (Blocking I/O)
- `Thread.join()`

## Objetivos da POC

- Entender o conceito de Virtual Threads
- Comparar Virtual Threads com Platform Threads tradicionais
- Aprender como criar e gerenciar Virtual Threads
- Executar tarefas concorrentes utilizando `ExecutorService`
- Avaliar o comportamento das Virtual Threads em operações bloqueantes
- Compreender os benefícios do Project Loom para aplicações modernas

## Principais conceitos aprendidos

- Virtual Threads são threads leves gerenciadas pela JVM.
- É possível criar Virtual Threads diretamente através de `Thread.startVirtualThread()`.
- O executor `Executors.newVirtualThreadPerTaskExecutor()` cria uma Virtual Thread para cada tarefa submetida.
- Virtual Threads simplificam o desenvolvimento concorrente mantendo um modelo de programação síncrono.
- Operações bloqueantes como chamadas HTTP, acesso a banco de dados e leitura de arquivos são os cenários onde Virtual Threads normalmente apresentam maior benefício.
- Foi possível executar milhares de tarefas concorrentes sem a necessidade de criar grandes pools de threads.
- Na comparação prática utilizando chamadas HTTP concorrentes, as Virtual Threads apresentaram melhor desempenho do que um pool fixo de Platform Threads.
- O ganho observado ocorreu porque as Virtual Threads conseguem lidar melhor com períodos de espera causados por operações de I/O.

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Virtual Threads

#### Vantagens

- Menor consumo de memória.
- Alta escalabilidade.
- Permite milhares de tarefas concorrentes.
- Código mais simples comparado a abordagens assíncronas complexas.
- Excelente para operações bloqueantes (HTTP, banco de dados, mensageria e arquivos).
- Integra facilmente com APIs já existentes do Java.

#### Desvantagens

- Não traz grandes ganhos para tarefas intensivas de CPU.
- Nem todas as bibliotecas antigas foram projetadas pensando em Virtual Threads.
- Pode aumentar a quantidade de concorrência e exigir atenção a recursos compartilhados.

### Platform Threads

#### Vantagens

- Modelo tradicional amplamente conhecido.
- Excelente para workloads menores e bem controlados.
- Compatibilidade total com bibliotecas legadas.

#### Desvantagens

- Alto custo de criação e gerenciamento.
- Consumo maior de memória.
- Escalabilidade limitada quando comparada às Virtual Threads.
- Necessidade de gerenciamento cuidadoso do tamanho dos pools.

## Resultados observados

Comparação utilizando 100 chamadas HTTP concorrentes:

| Implementação | Tempo aproximado |
|--------------|------------------|
| Platform Threads (`FixedThreadPool(10)`) | ~1139 ms |
| Virtual Threads (`VirtualThreadPerTaskExecutor`) | ~180 ms |

Os resultados demonstram que Virtual Threads podem oferecer ganhos significativos em cenários dominados por operações de I/O, reduzindo o tempo total de processamento e aumentando a capacidade de concorrência da aplicação.

## Referências

- https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html
- https://openjdk.org/jeps/444
- https://www.baeldung.com/java-virtual-threads
- https://www.baeldung.com/project-loom
- https://inside.java/2023/11/09/virtual-threads-final/