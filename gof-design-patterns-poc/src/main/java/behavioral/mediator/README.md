# Mediator Pattern

POC desenvolvida para demonstrar o padrão de projeto **Mediator**, que centraliza a comunicação entre objetos, evitando dependências diretas entre eles.

No contexto de e-commerce, o padrão é utilizado para orquestrar o fluxo de **checkout de um pedido**, onde serviços como estoque, pagamento, envio e notificações se comunicam através de um mediador central.

---

## Conceitos praticados

- Mediator Pattern
- Centralização de comunicação
- Desacoplamento entre serviços
- Orquestração de fluxo de negócio
- Event-driven simplificado

---

## Objetivos da POC

- Evitar comunicação direta entre serviços.
- Centralizar fluxo de checkout.
- Reduzir acoplamento entre componentes.
- Facilitar manutenção do fluxo de pedidos.

---

## Principais conceitos aprendidos

- O `Mediator` coordena todas as interações.
- Serviços não se conhecem diretamente.
- Cada serviço notifica o mediador sobre eventos.
- O mediador decide o próximo passo do fluxo.
- O sistema se torna mais organizado e centralizado.

---

## Estrutura do exemplo

- `Mediator` → Interface base
- `CheckoutMediator` → Orquestrador central
- `InventoryService` → Controle de estoque
- `PaymentService` → Processamento de pagamento
- `ShippingService` → Envio de pedidos
- `NotificationService` → Notificações ao cliente
- `CheckoutApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Reduz acoplamento entre classes.
- Centraliza lógica de fluxo.
- Facilita manutenção.
- Evita dependências circulares.

### Desvantagens

- Pode virar uma “God Object” (Mediator gigante).
- Complexidade pode aumentar centralmente.
- Difícil evolução se não for bem estruturado.

---

## Quando utilizar

- Fluxos complexos com múltiplos serviços.
- Sistemas de checkout.
- UI event handling.
- Coordenação de microserviços internos.

---

## Referências

- https://refactoring.guru/design-patterns/mediator
- https://www.baeldung.com/java-mediator-pattern