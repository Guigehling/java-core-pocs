# Java Streams API POC

POC desenvolvida em Java 21 com o objetivo de praticar os principais conceitos da Stream API e programação funcional no Java.

## Conceitos praticados

Durante esta POC foram estudados os seguintes recursos:

- Streams com `List`
- Streams com `Arrays`
- `map`
- `filter`
- `Predicate`
- `Supplier`
- `Consumer`
- `UnaryOperator`
- `BinaryOperator`
- `groupingBy`
- `reduce`
- Method Reference (`::`)
- Expressões Lambda

## Objetivos da POC

A POC demonstrou como:

- Processar coleções de forma funcional
- Filtrar dados usando `Predicate`
- Transformar objetos com `map`
- Agrupar informações usando `Collectors.groupingBy`
- Trabalhar com operações funcionais usando interfaces da JDK
- Utilizar pipelines com Streams
- Reduzir loops imperativos utilizando programação declarativa

## Interfaces Funcionais utilizadas

| Interface | Objetivo |
|---|---|
| `Predicate<T>` | Validação booleana |
| `Consumer<T>` | Consumo de dados |
| `Supplier<T>` | Fornecimento de dados |
| `UnaryOperator<T>` | Transformação do mesmo tipo |
| `BinaryOperator<T>` | Combinação de valores |

## Tecnologias

- Java 21

## Referências

- https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
- https://ravi-jaisawal.medium.com/functional-interfaces-in-java-e810bdd2bee3
- https://dev.to/kauegatto/streams-em-java-tudo-que-voce-precisa-saber-5f4b