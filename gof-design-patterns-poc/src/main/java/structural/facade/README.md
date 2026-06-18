# Facade Pattern

POC desenvolvida para demonstrar o padrão de projeto **Facade**, que fornece uma interface simplificada para um conjunto de subsistemas complexos.

No contexto de e-commerce, o padrão é utilizado para encapsular todo o processo de **checkout de um pedido**, escondendo a complexidade de serviços como estoque, pagamento, antifraude e envio.

---

## Conceitos praticados

- Facade Pattern
- Encapsulamento de complexidade
- Orquestração de subsistemas
- Redução de acoplamento no código cliente
- Simplificação de APIs complexas

---

## Objetivos da POC

- Simplificar o processo de checkout.
- Centralizar a orquestração de múltiplos serviços.
- Evitar que o cliente conheça múltiplos sistemas internos.
- Reduzir acoplamento entre camadas.

---

## Principais conceitos aprendidos

- A `OrderFacade` encapsula toda a lógica do checkout.
- O cliente (`FacadeApp`) interage com apenas uma classe.
- Serviços como `InventoryService`, `PaymentService` e `ShippingService` ficam isolados.
- O Facade não implementa regras de negócio complexas, apenas orquestra chamadas.
- Facilita manutenção e evolução do sistema.

---

## Estrutura do exemplo

- `InventoryService` → Controle de estoque
- `PaymentService` → Processamento de pagamento
- `ShippingService` → Envio do pedido
- `FraudService` → Validação antifraude
- `OrderFacade` → Orquestrador simplificado
- `FacadeApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Simplifica o uso de sistemas complexos.
- Reduz acoplamento entre cliente e subsistemas.
- Melhora legibilidade do código cliente.
- Centraliza fluxo de execução.

### Desvantagens

- Pode virar uma “God Class” se mal implementado.
- Esconde complexidade demais, dificultando debug.
- Pode concentrar muita responsabilidade.

---

## Quando utilizar

- Sistemas com múltiplos serviços internos.
- Processos complexos como checkout.
- APIs que precisam ser simplificadas.
- Integração entre múltiplos subsistemas.

---

## Referências

- https://refactoring.guru/design-patterns/facade
- https://www.baeldung.com/java-facade-pattern