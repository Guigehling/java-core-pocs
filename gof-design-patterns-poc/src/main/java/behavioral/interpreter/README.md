# Interpreter Pattern

POC desenvolvida para demonstrar o padrão de projeto **Interpreter**, que permite avaliar regras ou expressões simples através de uma estrutura interpretável.

No contexto de e-commerce, o padrão é utilizado para criar um **motor simples de regras de desconto**, baseado em condições como VIP e valor total da compra.

---

## Conceitos praticados

- Interpreter Pattern
- Avaliação de regras
- DSL simples baseada em strings
- Encapsulamento de lógica de decisão

---

## Objetivos da POC

- Simular um motor de regras simples.
- Avaliar condições de desconto dinamicamente.
- Evitar if/else espalhados no sistema.
- Demonstrar interpretação de regras.

---

## Principais conceitos aprendidos

- Regras são representadas como expressões.
- O contexto fornece os dados da avaliação.
- O interpretador decide o resultado baseado na regra.
- Pode ser expandido para novas regras facilmente.

---

## Estrutura do exemplo

- `Expression` → Interface base
- `DiscountRule` → Interpretador de regras simples
- `Context` → Dados do cliente/pedido
- `InterpreterApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Simples e direto.
- Fácil de entender em POC.
- Permite centralizar regras.
- Evita if/else espalhado.

### Desvantagens

- Escalabilidade limitada.
- Switch pode crescer demais.
- Não é ideal para regras complexas.
- Pode virar “mini rule engine mal estruturado”.

---

## Quando utilizar

- Regras simples de negócio.
- Validações configuráveis.
- Sistemas pequenos de decisão.
- Protótipos de motores de regra.

---

## Referências

- https://www.baeldung.com/java-interpreter-pattern