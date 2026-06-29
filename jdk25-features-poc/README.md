# ☕ Java 25 POC - Modern Concurrency & JVM Features

Esta POC demonstra recursos modernos do Java (JDK 25), com foco em concorrência estruturada, virtual threads, pattern matching, scoped values e FFM API.

---

## Conceitos praticados

- Virtual Threads (Project Loom)
- Structured Concurrency (JEP 505)
- Scoped Values (substituto moderno de ThreadLocal)
- Pattern Matching for switch
- Record Patterns
- Sequenced Collections
- Foreign Function & Memory API (FFM)
- Benchmark comparando modelos de threading

---

## Objetivos da POC

- Demonstrar o uso das novas APIs do Java moderno (JDK 21+ até JDK 25)
- Comparar modelos de concorrência (Thread Pool vs Virtual Threads)
- Aplicar Structured Concurrency para controle de tarefas paralelas
- Explorar novos recursos de linguagem e JVM
- Criar um laboratório prático para estudos e entrevistas técnicas

---

## Principais conceitos aprendidos

- Como Structured Concurrency organiza tarefas como uma unidade de trabalho
- Como Virtual Threads reduzem o custo de concorrência
- Como Scoped Values substituem ThreadLocal com melhor segurança e performance
- Como Pattern Matching reduz boilerplate e melhora legibilidade
- Como FFM API permite acesso seguro à memória fora da JVM heap
- Como medir impacto de diferentes modelos de execução concorrente

---

## Tecnologias

- Java 25 
- Project Loom (Virtual Threads + Structured Concurrency)
- JEP 505 - Structured Concurrency
- JEP 506 - Scoped Values
- JEP 441 - Pattern Matching for switch
- JEP 448 - Record Patterns
- JEP 460+ - Sequenced Collections
- JEP 442 - Foreign Function & Memory API

---

## Referências

- https://openjdk.org/jeps/505
- https://docs.oracle.com/en/java/javase/25/core/structured-concurrency.html
- https://openjdk.org/jeps/506
- https://openjdk.org/projects/loom/
- https://docs.oracle.com/javase/specs/
- https://openjdk.org/jeps/442