# JUnit 5 - All Features POC

POC desenvolvida para estudar os principais recursos do JUnit 5 (Jupiter), framework de testes utilizado para criação e execução de testes automatizados em aplicações Java.

## Conceitos praticados

- JUnit 5 (Jupiter)
- Test Lifecycle
- Assertions
- Exception Testing
- Timeout Testing
- Repeated Tests
- Parameterized Tests
- ValueSource
- CsvSource
- MethodSource
- Nested Tests
- DisplayName
- Disabled Tests
- Tags
- Test Ordering
- Extensions
- Mockito Integration

## Objetivos da POC

- Entender o ciclo de vida dos testes no JUnit 5
- Aprender os principais tipos de assertions
- Validar exceções esperadas
- Executar testes parametrizados
- Organizar cenários utilizando Nested Tests
- Controlar a ordem de execução dos testes
- Categorizar testes utilizando Tags
- Integrar extensões externas através de `@ExtendWith`
- Compreender a integração entre JUnit 5 e Mockito

## Principais conceitos aprendidos

- `@Test` define métodos de teste.
- `@BeforeAll` e `@AfterAll` executam uma única vez antes e após toda a suíte.
- `@BeforeEach` e `@AfterEach` executam antes e depois de cada teste.
- Assertions permitem validar comportamentos esperados da aplicação.
- `assertThrows()` permite validar exceções.
- `assertTimeout()` permite validar limites de tempo de execução.
- `@RepeatedTest` executa o mesmo teste múltiplas vezes.
- `@ParameterizedTest` permite executar um mesmo teste com diferentes entradas.
- `@ValueSource`, `@CsvSource` e `@MethodSource` fornecem dados para testes parametrizados.
- `@Nested` permite agrupar cenários relacionados, tornando a suíte mais organizada.
- `@DisplayName` melhora a legibilidade dos resultados dos testes.
- `@Disabled` permite desabilitar testes temporariamente.
- `@Tag` permite categorizar testes (unitários, integração, etc.).
- `@TestMethodOrder` permite controlar a ordem de execução dos testes.
- `@Order` define a sequência de execução dos métodos.
- `@ExtendWith` permite integrar frameworks externos ao ciclo de vida do JUnit.
- `MockitoExtension` simplifica a criação e inicialização de mocks.

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Framework moderno e amplamente adotado.
- Grande quantidade de recursos nativos.
- Excelente suporte para testes parametrizados.
- Integração simples com Mockito e Spring.
- Melhor organização através de Nested Tests.
- Controle de execução através de Tags e Ordering.
- Fácil manutenção e legibilidade dos testes.

### Desvantagens

- Algumas funcionalidades exigem dependências adicionais.
- Uso excessivo de ordenação pode indicar dependência entre testes.
- Nested Tests podem aumentar a complexidade quando utilizados em excesso.
- Curva de aprendizado maior em comparação aos recursos básicos do JUnit 4.

## Referências

- https://junit.org/junit5/
- https://junit.org/junit5/docs/current/user-guide/
- https://www.baeldung.com/junit-5
- https://www.baeldung.com/parameterized-tests-junit-5
- https://www.baeldung.com/junit-5-nested-test-classes
- https://www.baeldung.com/junit-5-test-order
- https://www.baeldung.com/mockito-junit-5-extension