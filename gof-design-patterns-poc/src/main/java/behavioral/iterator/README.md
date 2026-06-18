# Iterator Pattern

POC desenvolvida para demonstrar o padrão de projeto **Iterator**, que permite percorrer elementos de uma coleção sem expor sua estrutura interna.

No contexto de e-commerce, o padrão é utilizado para iterar sobre itens de um **carrinho de compras**, permitindo acesso sequencial aos produtos sem acoplar o cliente à estrutura da lista.

---

## Conceitos praticados

- Iterator Pattern
- Encapsulamento de coleção
- Percurso sequencial de elementos
- Separação entre coleção e iteração
- Acesso controlado a dados internos

---

## Objetivos da POC

- Permitir iteração de itens do carrinho.
- Esconder a implementação interna da coleção.
- Padronizar o acesso aos elementos.
- Demonstrar separação de responsabilidades.

---

## Principais conceitos aprendidos

- `Cart` representa a coleção de itens.
- `CartIterator` define o contrato de iteração.
- `CartItemIterator` implementa a lógica de navegação.
- O cliente não acessa diretamente a lista interna.
- O padrão permite troca da estrutura sem impactar o cliente.

---

## Estrutura do exemplo

- `Item` → Produto do carrinho
- `Cart` → Coleção de itens
- `CartIterator` → Interface do iterador
- `CartItemIterator` → Implementação concreta
- `IteratorApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Oculta estrutura interna da coleção.
- Padroniza iteração.
- Facilita mudanças internas sem impacto no cliente.
- Reduz acoplamento.

### Desvantagens

- Pode ser desnecessário em Java (já existe Iterator nativo).
- Aumenta número de classes.
- Overengineering para casos simples.

---

## Quando utilizar

- Quando a estrutura interna precisa ser protegida.
- Quando diferentes formas de iteração são necessárias.
- Em coleções complexas ou customizadas.
- Quando se quer desacoplar cliente da estrutura.

---

## Referências

- https://refactoring.guru/design-patterns/iterator
- https://www.baeldung.com/java-iterator-pattern