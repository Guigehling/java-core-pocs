# Chain of Responsibility Pattern

POC desenvolvida para demonstrar o padrão de projeto **Chain of Responsibility**, que permite passar uma requisição por uma cadeia de handlers, onde cada um pode processar ou rejeitar a requisição.

No contexto de e-commerce, o padrão é utilizado para validar um **pedido de compra**, passando por etapas como estoque, pagamento, antifraude e envio.

---

## Conceitos praticados

- Chain of Responsibility Pattern
- Encadeamento de handlers
- Separação de responsabilidades
- Fluxo sequencial de validação
- Encapsulamento de regras de negócio

---

## Objetivos da POC

- Criar um fluxo de validação de pedidos.
- Permitir adicionar/remover regras sem alterar o cliente.
- Encadear validações independentes.
- Demonstrar flexibilidade no processamento de regras.

---

## Principais conceitos aprendidos

- Cada handler executa uma responsabilidade específica.
- O fluxo segue uma cadeia até o fim ou até falha.
- `setNext()` conecta os handlers.
- O cliente não conhece a ordem interna da validação.
- Facilita extensão do pipeline.

---

## Estrutura do exemplo

- `Order` → Objeto da requisição
- `OrderHandler` → Handler base
- `StockValidationHandler` → Validação de estoque
- `PaymentValidationHandler` → Validação de pagamento
- `FraudValidationHandler` → Validação antifraude
- `ShippingValidationHandler` → Validação de envio
- `OrderProcessor` → Monta a cadeia
- `ChainApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Alta flexibilidade no fluxo.
- Fácil adicionar novas regras.
- Segue princípio de responsabilidade única.
- Desacoplamento entre regras.

### Desvantagens

- Pode dificultar debug em cadeias longas.
- Ordem dos handlers é crítica.
- Pode aumentar latência do processamento.

---

## Quando utilizar

- Pipelines de validação.
- Processamento de requisições em etapas.
- Sistemas de regras de negócio complexas.
- Middlewares (APIs, filtros, autenticação).

---

## Referências

- https://refactoring.guru/design-patterns/chain-of-responsibility
- https://www.baeldung.com/chain-of-responsibility-pattern