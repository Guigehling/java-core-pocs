# Singleton Pattern

POC desenvolvida para demonstrar o padrão de projeto **Singleton**, garantindo que apenas uma instância de uma classe exista durante toda a execução da aplicação.

O exemplo utiliza uma configuração global do gateway de pagamentos de um e-commerce, onde todos os componentes da aplicação compartilham a mesma instância.

## Conceitos praticados

- Singleton Pattern
- Instância única
- Construtor privado
- Método estático `getInstance()`
- Compartilhamento de configuração global

## Objetivos da POC

- Entender o funcionamento do padrão Singleton.
- Garantir que apenas um objeto seja criado.
- Demonstrar um caso de uso real utilizando configurações de um gateway de pagamento.

## Principais conceitos aprendidos

- O construtor é privado para impedir instanciação externa.
- A própria classe controla a criação de sua única instância.
- O método `getInstance()` retorna sempre o mesmo objeto.
- O padrão é útil para objetos compartilhados, como configurações, caches e loggers.

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Garante uma única instância durante toda a aplicação.
- Reduz consumo de memória para objetos compartilhados.
- Centraliza configurações globais.
- Fácil acesso por qualquer parte do sistema.

### Desvantagens

- Introduz estado global na aplicação.
- Pode aumentar o acoplamento entre componentes.
- Pode dificultar testes unitários quando utilizado de forma excessiva.

## Quando utilizar

- Configuração da aplicação.
- Configuração de gateway de pagamento.
- Gerenciadores de cache.
- Serviços de logging.
- Pools de conexão.

## Referências

- https://refactoring.guru/design-patterns/singleton
- https://www.baeldung.com/java-singleton