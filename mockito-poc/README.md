# Mockito POC

POC desenvolvida para estudar os principais recursos do Mockito, framework utilizado para criação de mocks e testes unitários em aplicações Java.

## Conceitos praticados

- Mockito
- Mock Objects
- Stubbing
- Verification
- Argument Matchers
- ArgumentCaptor
- Spy
- Exceptions Mocking
- Testes Unitários

## Objetivos da POC

- Entender como criar e utilizar mocks
- Isolar dependências durante testes unitários
- Simular comportamentos de serviços externos
- Verificar interações entre objetos
- Aprender a capturar argumentos utilizados em chamadas
- Simular exceções e cenários de erro
- Explorar os principais recursos disponibilizados pelo Mockito

## Principais conceitos aprendidos

- Mocks permitem substituir dependências reais durante a execução dos testes.
- O método `when(...).thenReturn(...)` permite definir comportamentos esperados.
- O método `doThrow(...)` permite simular exceções.
- O método `verify(...)` permite validar se uma interação ocorreu.
- Argument Matchers como `any()`, `anyString()` e `eq()` facilitam a configuração de cenários.
- O `ArgumentCaptor` permite inspecionar parâmetros enviados para métodos.
- O `Spy` permite monitorar objetos reais mantendo seu comportamento original.
- O Mockito auxilia na construção de testes mais isolados, previsíveis e rápidos.

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Facilita o isolamento de dependências.
- Reduz a necessidade de objetos reais durante os testes.
- Permite simular cenários complexos de forma simples.
- Melhora a velocidade de execução dos testes.
- Possui integração nativa com JUnit.
- Amplamente utilizado pela comunidade Java.

### Desvantagens

- Uso excessivo de mocks pode tornar os testes frágeis.
- Pode esconder problemas de integração entre componentes.
- Exige conhecimento sobre o comportamento interno da aplicação.
- Testes excessivamente mockados podem perder valor de negócio.

## Referências

- https://site.mockito.org
- https://javadoc.io/doc/org.mockito/mockito-core/latest/index.html
- https://www.baeldung.com/mockito-series
- https://www.baeldung.com/mockito-junit-5-extension
- https://www.baeldung.com/mockito-verify