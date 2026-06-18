# State Pattern

POC desenvolvida para demonstrar o padrão de projeto **State**, que permite que um objeto altere seu comportamento quando seu estado interno muda.

No contexto de e-commerce, o padrão é utilizado para representar o ciclo de vida de um **pedido**, permitindo que operações válidas dependam do estado atual.

---

## Conceitos praticados

- State Pattern
- Encapsulamento de estados
- Transição entre estados
- Eliminação de grandes blocos de `if/else`
- Delegação de comportamento

---

## Objetivos da POC

- Modelar o ciclo de vida de um pedido.
- Encapsular o comportamento de cada estado.
- Permitir transições controladas entre estados.
- Demonstrar como o comportamento muda dinamicamente.

---

## Principais conceitos aprendidos

- O `Order` atua como contexto e delega ações para o estado atual.
- Cada implementação de `OrderState` define seu próprio comportamento.
- A mudança de estado altera automaticamente o comportamento futuro do objeto.
- O padrão evita múltiplos condicionais espalhados pelo código.

---

## Estrutura do exemplo

- `OrderState` → Interface dos estados
- `CreatedState` → Pedido criado
- `PaidState` → Pedido pago
- `ShippedState` → Pedido enviado
- `Order` → Contexto que mantém o estado atual
- `StateApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Elimina grandes blocos de `if/else` ou `switch`.
- Facilita adicionar novos estados.
- Cada estado possui responsabilidade única.
- Melhora a organização e manutenção do código.

### Desvantagens

- Pode aumentar a quantidade de classes.
- Fluxos muito simples podem ficar excessivamente complexos.
- Exige cuidado para controlar corretamente as transições.

---

## Quando utilizar

- Fluxos de status de pedidos.
- Máquinas de estado.
- Processos de aprovação.
- Workflows com transições bem definidas.
- Sistemas onde o comportamento depende do estado atual.

---

## Referências

- https://refactoring.guru/design-patterns/state
- https://www.baeldung.com/java-state-design-pattern