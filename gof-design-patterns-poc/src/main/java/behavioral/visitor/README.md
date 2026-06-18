# Visitor Pattern

POC desenvolvida para demonstrar o padrão de projeto **Visitor**, que permite adicionar novas operações sobre uma estrutura de objetos sem modificar suas classes.

No contexto de e-commerce, o padrão é utilizado para calcular o **valor total de um carrinho**, considerando produtos e frete através de um visitante.

---

## Conceitos praticados

- Visitor Pattern
- Double Dispatch
- Separação entre estrutura e comportamento
- Extensibilidade de operações
- Polimorfismo

---

## Objetivos da POC

- Adicionar uma operação sobre elementos do carrinho sem alterar suas classes.
- Demonstrar o mecanismo de double dispatch.
- Separar regras de cálculo da estrutura dos objetos.
- Facilitar inclusão de novas operações futuramente.

---

## Principais conceitos aprendidos

- `CartElement` define o método `accept()`.
- Cada elemento recebe um visitante através de `accept()`.
- O `Visitor` implementa uma operação específica para cada tipo de elemento.
- Novas operações podem ser adicionadas criando novos visitors, sem modificar `Product` ou `Shipping`.

---

## Estrutura do exemplo

- `CartElement` → Interface dos elementos visitáveis
- `Visitor` → Interface do visitante
- `Product` → Produto do carrinho
- `Shipping` → Frete do pedido
- `TotalPriceVisitor` → Calcula o valor total
- `VisitorApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Permite adicionar novas operações sem alterar as classes dos elementos.
- Separa estrutura de dados e comportamento.
- Facilita aplicação de diferentes regras sobre os mesmos objetos.
- Favorece o princípio Open/Closed.

### Desvantagens

- Adicionar um novo tipo de elemento exige modificar todos os visitors.
- Aumenta a quantidade de interfaces e classes.
- Pode ser excessivo para estruturas pequenas.

---

## Quando utilizar

- Cálculo de preços ou impostos.
- Geração de relatórios.
- Exportação de dados.
- Validação de estruturas complexas.
- Operações sobre árvores ou coleções heterogêneas.

---

## Referências

- https://refactoring.guru/design-patterns/visitor
- https://www.baeldung.com/java-visitor-pattern