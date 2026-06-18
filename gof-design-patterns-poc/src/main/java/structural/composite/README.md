# Composite Pattern

POC desenvolvida para demonstrar o padrão de projeto **Composite**, que permite tratar objetos individuais e composições de objetos de forma uniforme.

No contexto de e-commerce, o padrão é utilizado para representar um **carrinho de compras**, onde produtos individuais e pacotes de produtos podem ser tratados da mesma maneira.

---

## Conceitos praticados

- Composite Pattern
- Estrutura hierárquica de objetos
- Recursividade
- Tratamento uniforme de objetos simples e compostos
- Organização de árvores de componentes

---

## Objetivos da POC

- Representar produtos individuais e pacotes de forma uniforme.
- Permitir criação de bundles (kits de produtos).
- Facilitar o cálculo de preços compostos.
- Demonstrar estrutura hierárquica no carrinho de compras.

---

## Principais conceitos aprendidos

- `CartComponent` define a interface comum.
- `ProductItem` representa um objeto simples (Leaf).
- `ProductBundle` representa um conjunto de itens (Composite).
- Ambos são tratados da mesma forma pelo cliente.
- O cálculo de preço é recursivo em estruturas compostas.

---

## Estrutura do exemplo

- `CartComponent` → Interface base
- `ProductItem` → Produto individual (Leaf)
- `ProductBundle` → Conjunto de produtos (Composite)
- `CompositeApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Permite estruturas hierárquicas flexíveis.
- Trata objetos simples e compostos uniformemente.
- Facilita expansão de estruturas complexas.
- Reduz complexidade no código cliente.

### Desvantagens

- Pode dificultar entendimento da estrutura.
- Pode introduzir complexidade desnecessária.
- Debug de estruturas profundas pode ser mais difícil.

---

## Quando utilizar

- Estruturas em árvore (menus, carrinhos, categorias).
- Quando objetos individuais e compostos precisam ser tratados igual.
- Sistemas com agrupamento de itens.
- Representação de hierarquias.

---

## Referências

- https://refactoring.guru/design-patterns/composite
- https://www.baeldung.com/java-composite-pattern