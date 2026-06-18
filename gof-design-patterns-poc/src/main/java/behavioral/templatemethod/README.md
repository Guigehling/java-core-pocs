# Template Method Pattern

POC desenvolvida para demonstrar o padrão de projeto **Template Method**, que define o esqueleto de um algoritmo em uma classe base, permitindo que subclasses implementem etapas específicas sem alterar a estrutura geral do processo.

No contexto de e-commerce, o padrão é utilizado para representar o **processamento de pedidos**, onde todas as compras seguem o mesmo fluxo de validação e confirmação, variando apenas a forma de pagamento.

---

## Conceitos praticados

- Template Method Pattern
- Reutilização de algoritmo
- Herança
- Polimorfismo
- Inversão de controle

---

## Objetivos da POC

- Definir um fluxo fixo para processamento de pedidos.
- Permitir personalização apenas da etapa de pagamento.
- Evitar duplicação de código.
- Demonstrar reutilização através de herança.

---

## Principais conceitos aprendidos

- `OrderProcessor` define o algoritmo completo através do método `processOrder()`.
- Algumas etapas são implementadas na classe base.
- O método `processPayment()` é abstrato e deve ser implementado pelas subclasses.
- O fluxo permanece consistente independentemente da implementação concreta.

---

## Estrutura do exemplo

- `OrderProcessor` → Classe abstrata com o template method
- `PixOrderProcessor` → Implementação para pagamento via PIX
- `CreditCardOrderProcessor` → Implementação para pagamento com cartão
- `TemplateMethodApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Evita duplicação de código.
- Garante consistência no fluxo do algoritmo.
- Facilita reutilização através de herança.
- Permite customizar apenas partes específicas do processo.

### Desvantagens

- Baseado em herança, aumentando o acoplamento entre classes.
- Alterações no template podem impactar todas as subclasses.
- Pouco flexível quando muitas variações são necessárias.

---

## Quando utilizar

- Processamento de pedidos.
- Fluxos de checkout.
- Geração de relatórios.
- Processos de importação/exportação.
- Algoritmos que possuem uma sequência fixa de etapas.

---

## Referências

- https://refactoring.guru/design-patterns/template-method
- https://www.baeldung.com/java-template-method-pattern