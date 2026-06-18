# Command Pattern

POC desenvolvida para demonstrar o padrão de projeto **Command**, que encapsula uma requisição como um objeto, permitindo parametrizar ações, enfileirar execuções e desacoplar quem solicita de quem executa.

No contexto de e-commerce, o padrão é utilizado para representar ações do fluxo de pedido, como **criação do pedido, processamento de pagamento e envio**, de forma desacoplada e extensível.

---

## Conceitos praticados

- Command Pattern
- Encapsulamento de ações como objetos
- Separação entre invoker e receiver
- Execução desacoplada
- Suporte a filas de execução

---

## Objetivos da POC

- Transformar ações do sistema em objetos.
- Permitir execução desacoplada de comandos.
- Facilitar extensibilidade do fluxo de checkout.
- Permitir futuras features como retry, log e undo.

---

## Principais conceitos aprendidos

- `Command` define o contrato de execução.
- Cada ação do sistema vira um comando independente.
- `OrderService` é o receiver (executa a lógica real).
- `CommandInvoker` gerencia a execução dos comandos.
- O cliente não conhece a implementação interna.

---

## Estrutura do exemplo

- `Command` → Interface base
- `CreateOrderCommand` → Criação de pedido
- `ProcessPaymentCommand` → Processamento de pagamento
- `ShipOrderCommand` → Envio do pedido
- `OrderService` → Lógica real do sistema
- `CommandInvoker` → Executor de comandos
- `CommandApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Desacopla quem chama de quem executa.
- Permite fila de execução.
- Facilita logging, retry e undo.
- Alta extensibilidade.

### Desvantagens

- Aumenta número de classes.
- Pode ser excessivo para fluxos simples.
- Pode adicionar complexidade arquitetural.

---

## Quando utilizar

- Sistemas de fila (jobs, tarefas assíncronas).
- Fluxos de checkout.
- Operações que precisam ser auditadas.
- Implementação de undo/redo.
- Sistemas baseados em eventos.

---

## Referências

- https://refactoring.guru/design-patterns/command
- https://www.baeldung.com/java-command-pattern