# Strategy Pattern

POC desenvolvida para demonstrar o padrão de projeto **Strategy**, que define uma família de algoritmos, encapsula cada um deles e permite que sejam utilizados de forma intercambiável.

No contexto de e-commerce, o padrão é utilizado para representar diferentes **formas de pagamento**, permitindo alterar a estratégia de processamento sem modificar o código do checkout.

---

## Conceitos praticados

- Strategy Pattern
- Encapsulamento de algoritmos
- Polimorfismo
- Composição
- Troca de comportamento em tempo de execução

---

## Objetivos da POC

- Demonstrar diferentes estratégias de pagamento.
- Permitir trocar o algoritmo utilizado pelo checkout.
- Eliminar condicionais baseadas no tipo de pagamento.
- Facilitar a inclusão de novos meios de pagamento.

---

## Principais conceitos aprendidos

- `PaymentStrategy` define o contrato comum para todas as estratégias.
- Cada implementação representa uma forma de pagamento diferente.
- `CheckoutService` delega o processamento para a estratégia configurada.
- Novas estratégias podem ser adicionadas sem alterar o código existente.

---

## Estrutura do exemplo

- `PaymentStrategy` → Interface das estratégias
- `PixPaymentStrategy` → Pagamento via PIX
- `CreditCardPaymentStrategy` → Pagamento com cartão de crédito
- `BoletoPaymentStrategy` → Pagamento via boleto
- `CheckoutService` → Contexto que utiliza a estratégia
- `StrategyApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Elimina grandes blocos de `if/else` ou `switch`.
- Facilita adicionar novos algoritmos.
- Promove baixo acoplamento.
- Permite alterar o comportamento em tempo de execução.

### Desvantagens

- Aumenta o número de classes.
- O cliente precisa conhecer as estratégias disponíveis.
- Pode ser excessivo para algoritmos muito simples.

---

## Quando utilizar

- Formas de pagamento.
- Cálculo de frete.
- Cálculo de descontos.
- Algoritmos de ordenação ou busca.
- Qualquer cenário onde múltiplos algoritmos possam ser utilizados de forma intercambiável.

---

## Referências

- https://refactoring.guru/design-patterns/strategy
- https://www.baeldung.com/java-strategy-pattern