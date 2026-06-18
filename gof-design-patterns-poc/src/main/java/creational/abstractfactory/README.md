# Abstract Factory Pattern

POC desenvolvida para demonstrar o padrão de projeto **Abstract Factory**, permitindo criar famílias de objetos relacionados sem acoplar o código às suas implementações concretas.

No exemplo, um sistema de e-commerce suporta diferentes meios de pagamento. Cada fábrica cria um conjunto consistente de objetos responsáveis por processar pagamentos e gerar comprovantes.

## Conceitos praticados

- Abstract Factory Pattern
- Interfaces
- Polimorfismo
- Criação de famílias de objetos
- Desacoplamento entre cliente e implementação

## Objetivos da POC

- Demonstrar como criar famílias de objetos relacionados.
- Evitar dependência direta de implementações concretas.
- Facilitar a adição de novos tipos de pagamento.

## Principais conceitos aprendidos

- Cada fábrica concreta produz objetos compatíveis entre si.
- O cliente depende apenas das abstrações (`PaymentFactory`, `PaymentProcessor` e `ReceiptGenerator`).
- Novas famílias podem ser adicionadas sem alterar o código cliente.
- O padrão promove baixo acoplamento e alta extensibilidade.

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Reduz o acoplamento com implementações concretas.
- Facilita a troca completa de famílias de objetos.
- Segue o princípio Open/Closed.
- Simplifica a expansão do sistema.

### Desvantagens

- Aumenta a quantidade de classes.
- Pode tornar a estrutura mais complexa para projetos pequenos.

## Quando utilizar

- Sistemas com múltiplas famílias de objetos relacionadas.
- Frameworks com suporte a diferentes implementações.
- Aplicações que precisam trocar completamente o comportamento conforme o contexto.

## Referências

- https://refactoring.guru/design-patterns/abstract-factory
- https://www.baeldung.com/java-abstract-factory-pattern