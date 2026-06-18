# Bridge Pattern

POC desenvolvida para demonstrar o padrão de projeto **Bridge**, que separa uma abstração da sua implementação, permitindo que ambas possam variar independentemente.

No contexto de e-commerce, o padrão é utilizado para desacoplar o **tipo de pagamento (PIX, Cartão de Crédito)** do **gateway responsável por processar o pagamento (Pix, PayPal, etc.)**.

---

## Conceitos praticados

- Bridge Pattern
- Separação de abstração e implementação
- Composição no lugar de herança
- Desacoplamento de responsabilidades
- Extensibilidade do sistema

---

## Objetivos da POC

- Separar lógica de pagamento da infraestrutura de gateway.
- Permitir combinação entre diferentes tipos de pagamento e provedores.
- Evitar explosão de classes (ex: PixPayPal, PixStripe, etc.).
- Demonstrar flexibilidade arquitetural.

---

## Principais conceitos aprendidos

- A abstração (`PaymentProcessor`) não depende da implementação concreta.
- O `PaymentGateway` define a interface dos provedores de pagamento.
- Implementações concretas podem ser combinadas livremente.
- Novos gateways ou tipos de pagamento podem ser adicionados independentemente.
- O Bridge evita acoplamento entre hierarquias.

---

## Estrutura do exemplo

- `PaymentGateway` → Interface de implementação
- `PixGateway` → Gateway PIX
- `PayPalGateway` → Gateway PayPal
- `CreditCardGateway` → Gateway cartão de crédito
- `PaymentProcessor` → Abstração de pagamento
- `PixPayment` → Abstração refinada PIX
- `CreditCardPayment` → Abstração refinada cartão
- `BridgeApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Evita explosão de subclasses.
- Alto nível de flexibilidade.
- Permite evolução independente de abstração e implementação.
- Facilita manutenção e extensão.

### Desvantagens

- Aumenta complexidade inicial.
- Pode ser overengineering para sistemas simples.
- Mais camadas para entender no fluxo.

---

## Quando utilizar

- Quando abstração e implementação podem variar independentemente.
- Quando há múltiplos provedores para a mesma funcionalidade.
- Quando evitar combinação explosiva de classes.
- Em sistemas com múltiplos gateways ou integrações.

---

## Referências

- https://refactoring.guru/design-patterns/bridge
- https://www.baeldung.com/java-bridge-pattern