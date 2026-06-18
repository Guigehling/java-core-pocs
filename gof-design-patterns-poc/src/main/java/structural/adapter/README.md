# Adapter Pattern

POC desenvolvida para demonstrar o padrão de projeto **Adapter**, que permite que classes com interfaces incompatíveis trabalhem juntas através de um "adaptador" que converte uma interface em outra esperada pelo cliente.

No contexto de e-commerce, o padrão é utilizado para integrar um **sistema legado de pagamento PayPal** que não segue a interface atual do sistema.

---

## Conceitos praticados

- Adapter Pattern
- Integração de sistemas legados
- Conversão de interfaces incompatíveis
- Encapsulamento de adaptação
- Polimorfismo

---

## Objetivos da POC

- Integrar um sistema legado sem alterar seu código.
- Adaptar interfaces antigas para o padrão atual do sistema.
- Demonstrar desacoplamento entre cliente e implementação.
- Permitir evolução do sistema sem quebrar integrações.

---

## Principais conceitos aprendidos

- O `PaymentProcessor` define a interface padrão do sistema.
- O `LegacyPayPalService` representa um sistema externo legado.
- O `PayPalAdapter` adapta o sistema legado para a interface atual.
- O cliente (`PaymentService`) não conhece implementações concretas.
- O Adapter evita refatorações em sistemas externos.

---

## Estrutura do exemplo

- `PaymentProcessor` → Interface padrão de pagamento
- `PixPaymentProcessor` → Implementação moderna (PIX)
- `LegacyPayPalService` → Sistema legado externo
- `PayPalAdapter` → Adaptador entre legado e sistema atual
- `PaymentService` → Cliente que executa pagamentos
- `AdapterApp` → Classe principal de demonstração

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Permite integração com sistemas legados.
- Evita alterações em código externo.
- Reduz impacto de mudanças no sistema.
- Promove reuso de código existente.

### Desvantagens

- Pode aumentar complexidade do sistema.
- Introduz uma camada extra de abstração.
- Pode dificultar debugging em integrações complexas.

---

## Quando utilizar

- Integração com APIs legadas.
- Sistemas que não podem ser modificados.
- Conversão de formatos ou interfaces incompatíveis.
- Migração gradual de sistemas antigos para novos.

---

## Referências

- https://refactoring.guru/design-patterns/adapter
- https://www.baeldung.com/java-adapter-pattern