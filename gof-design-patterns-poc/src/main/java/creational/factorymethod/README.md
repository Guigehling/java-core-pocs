# Factory Method Pattern

POC desenvolvida para demonstrar o padrão de projeto **Factory Method**, que define uma interface para criação de objetos, permitindo que a própria fábrica decida qual implementação concreta deve ser instanciada.

O exemplo utiliza um cenário de e-commerce com diferentes métodos de pagamento, como **Pix** e **Cartão de Crédito**, onde a criação dos processadores é centralizada em uma fábrica.

## Conceitos praticados

- Factory Method Pattern
- Encapsulamento da criação de objetos
- Polimorfismo
- Programação orientada a interfaces
- Desacoplamento entre criação e uso

## Objetivos da POC

- Entender como centralizar a criação de objetos.
- Evitar o uso direto de `new` no código cliente.
- Permitir a adição de novos métodos de pagamento sem alterar o código principal.
- Demonstrar o uso de polimorfismo para seleção de comportamento.

## Principais conceitos aprendidos

- A interface `PaymentProcessor` define um contrato comum para todos os pagamentos.
- Implementações concretas (`PixPaymentProcessor`, `CreditCardPaymentProcessor`) encapsulam regras específicas.
- A `PaymentProcessorFactory` decide qual classe instanciar com base no tipo informado.
- O código cliente não conhece as classes concretas, apenas a abstração.
- O sistema se torna extensível sem modificar o fluxo existente.

## Estrutura do exemplo

- `PaymentProcessor` → Interface base para processadores de pagamento
- `PixPaymentProcessor` → Implementação de pagamento via Pix
- `CreditCardPaymentProcessor` → Implementação de pagamento via cartão de crédito
- `PaymentProcessorFactory` → Fábrica responsável por criar instâncias corretas
- `FactoryMethodApp` → Classe principal que demonstra o uso do pattern

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Reduz acoplamento entre código cliente e implementações concretas.
- Facilita a inclusão de novos tipos de pagamento.
- Centraliza a lógica de criação.
- Melhora organização e clareza do código.

### Desvantagens

- Pode aumentar o número de classes.
- Pode adicionar complexidade desnecessária em sistemas simples.
- Exige entendimento do padrão para manutenção.

## Quando utilizar

- Quando há múltiplas variações de um mesmo tipo de objeto.
- Quando a lógica de criação pode mudar ou crescer.
- Em sistemas extensíveis como pagamentos, notificações ou integrações.
- Quando se deseja evitar instâncias diretas com `new` no código cliente.

## Referências

- https://refactoring.guru/design-patterns/factory-method
- https://www.baeldung.com/java-factory-pattern