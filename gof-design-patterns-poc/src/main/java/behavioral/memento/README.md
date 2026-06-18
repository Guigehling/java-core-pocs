# Memento Pattern

POC desenvolvida para demonstrar o padrão de projeto **Memento**, que permite capturar e restaurar estados internos de um objeto sem violar o encapsulamento.

No contexto de e-commerce, o padrão é utilizado para permitir **edição e rollback de pedidos antes da finalização do checkout**, simulando funcionalidades de “undo”.

---

## Conceitos praticados

- Memento Pattern
- Snapshot de estado
- Undo/rollback de operações
- Encapsulamento preservado
- Histórico de estados

---

## Objetivos da POC

- Permitir salvar estados intermediários de um pedido.
- Restaurar versões anteriores do pedido.
- Simular edição segura antes da finalização.
- Demonstrar controle de histórico de alterações.

---

## Principais conceitos aprendidos

- O `Order` é o Originator (estado principal).
- O `OrderMemento` armazena snapshots do estado.
- O `OrderHistory` gerencia versões salvas.
- O estado pode ser restaurado a qualquer momento.
- O encapsulamento do objeto original é preservado.

---

## Estrutura do exemplo

- `Order` → Objeto principal (Originator)
- `OrderMemento` → Snapshot do estado
- `OrderHistory` → Gerenciador de histórico
- `MementoApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Permite rollback de estado.
- Preserva encapsulamento.
- Simples de implementar.
- Útil para editores e fluxos de checkout.

### Desvantagens

- Pode consumir muita memória com histórico grande.
- Não escala bem sem controle de retenção.
- Pode aumentar complexidade de gestão de estados.

---

## Quando utilizar

- Undo/redo de operações.
- Checkout com edição de pedidos.
- Editores de texto ou gráficos.
- Fluxos transacionais com rollback.

---

## Referências

- https://refactoring.guru/design-patterns/memento
