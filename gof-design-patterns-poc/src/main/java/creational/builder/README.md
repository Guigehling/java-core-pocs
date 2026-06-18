# Builder Pattern

POC desenvolvida para demonstrar o padrão de projeto **Builder**, que permite a construção de objetos complexos passo a passo, separando a criação da representação final do objeto.

No contexto de e-commerce, o padrão é utilizado para montar uma requisição de pagamento (`PaymentRequest`) com múltiplos parâmetros opcionais, evitando construtores extensos e difíceis de manter.

## Conceitos praticados

- Builder Pattern
- Encadeamento de métodos (method chaining)
- Imutabilidade de objetos
- Separação de construção e representação
- Objetos complexos com muitos parâmetros opcionais

## Objetivos da POC

- Evitar construtores com muitos parâmetros.
- Facilitar a criação de objetos complexos.
- Melhorar legibilidade do código cliente.
- Permitir flexibilidade na construção do objeto.

## Principais conceitos aprendidos

- O objeto final (`PaymentRequest`) é imutável.
- O Builder controla a criação do objeto passo a passo.
- Campos opcionais possuem valores padrão.
- O método `build()` centraliza validações antes da criação.
- Permite diferentes combinações de configuração sem múltiplos construtores.

## Estrutura do exemplo

- `PaymentRequest` → Objeto final imutável representando um pagamento
- `PaymentRequestBuilder` → Classe responsável pela construção do objeto
- `BuilderApp` → Classe principal demonstrando o uso do pattern

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Evita construtores extensos e confusos.
- Melhora legibilidade e clareza do código.
- Facilita criação de objetos com muitos parâmetros opcionais.
- Permite objetos imutáveis.
- Código mais expressivo no cliente.

### Desvantagens

- Aumenta o número de classes/linhas de código.
- Pode ser excessivo para objetos simples.
- Pode introduzir complexidade desnecessária em sistemas pequenos.

## Quando utilizar

- Quando um objeto possui muitos parâmetros opcionais.
- Quando a criação do objeto precisa de validação complexa.
- Em objetos de configuração, requests ou DTOs complexos.
- Quando se deseja garantir imutabilidade.

## Referências

- https://refactoring.guru/design-patterns/builder
- https://www.baeldung.com/creational-design-patterns