# Decorator Pattern

POC desenvolvida para demonstrar o padrão de projeto **Decorator**, que permite adicionar comportamentos a objetos dinamicamente, sem alterar sua estrutura original.

No contexto de e-commerce, o padrão é utilizado para aplicar **descontos, frete expresso e seguro** sobre um pedido, combinando funcionalidades de forma flexível.

---

## Conceitos praticados

- Decorator Pattern
- Composição ao invés de herança
- Adição dinâmica de funcionalidades
- Encadeamento de responsabilidades
- Open/Closed Principle

---

## Objetivos da POC

- Permitir adicionar funcionalidades a pedidos sem modificar a classe base.
- Aplicar múltiplos comportamentos dinamicamente.
- Evitar explosão de subclasses (OrderWithDiscountWithShipping...).
- Demonstrar flexibilidade na composição de regras.

---

## Principais conceitos aprendidos

- `OrderComponent` define o contrato base.
- `SimpleOrder` é o objeto principal.
- `OrderDecorator` encapsula um objeto do mesmo tipo.
- Decorators adicionam comportamento antes/depois da execução.
- O objeto final é construído em camadas.

---

## Estrutura do exemplo

- `OrderComponent` → Interface base
- `SimpleOrder` → Pedido simples
- `OrderDecorator` → Base para decorators
- `DiscountDecorator` → Aplica desconto
- `ExpressShippingDecorator` → Adiciona frete expresso
- `InsuranceDecorator` → Adiciona seguro
- `DecoratorApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Alta flexibilidade na composição de comportamentos.
- Evita explosão de subclasses.
- Segue o princípio Open/Closed.
- Permite combinação dinâmica de funcionalidades.

### Desvantagens

- Pode aumentar complexidade de leitura.
- Debug pode ser mais difícil em cadeias longas.
- Ordem dos decorators pode impactar o resultado.

---

## Quando utilizar

- Aplicação de descontos e promoções.
- Adição de taxas e serviços extras.
- Extensão dinâmica de funcionalidades.
- Sistemas de checkout e billing.

---

## Referências

- https://refactoring.guru/design-patterns/decorator
- https://www.baeldung.com/java-decorator-pattern