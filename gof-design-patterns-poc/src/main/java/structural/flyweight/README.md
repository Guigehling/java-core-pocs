# Flyweight Pattern

POC desenvolvida para demonstrar o padrão de projeto **Flyweight**, que reduz o uso de memória compartilhando estados comuns entre múltiplos objetos semelhantes.

No contexto de e-commerce, o padrão é utilizado para otimizar um **catálogo de produtos grande**, onde marcas e estruturas repetidas podem ser compartilhadas entre vários itens.

---

## Conceitos praticados

- Flyweight Pattern
- Compartilhamento de objetos
- Estado intrínseco e extrínseco
- Otimização de memória
- Factory com cache de objetos

---

## Objetivos da POC

- Reduzir consumo de memória em sistemas com muitos objetos.
- Compartilhar dados comuns entre produtos.
- Evitar criação repetida de objetos semelhantes.
- Demonstrar separação entre estado interno e externo.

---

## Principais conceitos aprendidos

- Estado **intrínseco** (compartilhado) → ex: marca do produto
- Estado **extrínseco** (variável) → ex: nome, preço, categoria
- Flyweights são reutilizados via factory com cache.
- Objetos são criados apenas uma vez por chave.
- O contexto externo é passado na execução.

---

## Estrutura do exemplo

- `ProductFlyweight` → Interface do flyweight
- `ConcreteProductFlyweight` → Implementação com estado compartilhado
- `ProductContext` → Estado externo (único por produto)
- `ProductFlyweightFactory` → Cache e reuso de instâncias
- `FlyweightApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Reduz drasticamente uso de memória.
- Reutiliza objetos comuns.
- Ideal para sistemas com muitos itens repetidos.
- Melhora performance em larga escala.

### Desvantagens

- Aumenta complexidade do código.
- Separação de estado pode confundir o design.
- Nem sempre necessário em sistemas pequenos.
- Pode dificultar debugging.

---

## Quando utilizar

- Catálogos com milhares de produtos.
- Sistemas de rendering (UI, jogos, mapas).
- Dados repetitivos com pequenas variações.
- Quando memória é um fator crítico.

---

## Referências

- https://refactoring.guru/design-patterns/flyweight
- https://www.baeldung.com/java-flyweight-pattern