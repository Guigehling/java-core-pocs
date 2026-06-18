# Design Patterns GOF - Java POCs

Este projeto contém implementações simples dos **23 Design Patterns do GoF (Gang of Four)** utilizando **Java 21** e o contexto de **e-commerce** como domínio principal.

O objetivo é servir como material de estudo e referência prática, apresentando exemplos independentes e de fácil compreensão para cada padrão.

## Patterns Criacionais (Creational)

| Pattern | Descrição |
|----------|-----------|
| **Singleton** | Garante que uma classe possua apenas uma única instância e fornece um ponto global de acesso a ela. |
| **Factory Method** | Define um método para criação de objetos, permitindo que subclasses decidam qual implementação instanciar. |
| **Abstract Factory** | Fornece uma interface para criação de famílias de objetos relacionados sem especificar suas classes concretas. |
| **Builder** | Separa a construção de um objeto complexo da sua representação, permitindo diferentes formas de criação. |
| **Prototype** | Cria novos objetos através da clonagem de uma instância existente. |

---

## Patterns Estruturais (Structural)

| Pattern | Descrição |
|----------|-----------|
| **Adapter** | Permite que interfaces incompatíveis trabalhem juntas através de uma adaptação. |
| **Bridge** | Separa uma abstração de sua implementação para que ambas possam evoluir independentemente. |
| **Composite** | Trata objetos individuais e composições de objetos de maneira uniforme. |
| **Decorator** | Adiciona novas responsabilidades a um objeto dinamicamente sem alterar sua estrutura. |
| **Facade** | Fornece uma interface simplificada para um conjunto de subsistemas complexos. |
| **Flyweight** | Compartilha objetos para reduzir o consumo de memória quando há grande quantidade de instâncias semelhantes. |
| **Proxy** | Fornece um objeto substituto que controla o acesso ao objeto real. |

---

## Patterns Comportamentais (Behavioral)

| Pattern | Descrição |
|----------|-----------|
| **Chain of Responsibility** | Encadeia manipuladores para processar uma requisição até que ela seja atendida. |
| **Command** | Encapsula uma requisição como um objeto, desacoplando quem solicita de quem executa. |
| **Interpreter** | Define uma representação para uma linguagem e um interpretador para avaliar suas expressões. |
| **Iterator** | Permite percorrer os elementos de uma coleção sem expor sua implementação interna. |
| **Mediator** | Centraliza a comunicação entre objetos, reduzindo o acoplamento entre eles. |
| **Memento** | Captura e restaura o estado interno de um objeto sem violar seu encapsulamento. |
| **Observer** | Define uma dependência um-para-muitos para notificar automaticamente objetos interessados sobre mudanças de estado. |
| **State** | Permite que um objeto altere seu comportamento quando seu estado interno muda. |
| **Strategy** | Define uma família de algoritmos intercambiáveis, permitindo trocar o comportamento em tempo de execução. |
| **Template Method** | Define o esqueleto de um algoritmo, permitindo que subclasses implementem etapas específicas. |
| **Visitor** | Permite adicionar novas operações a uma estrutura de objetos sem modificar suas classes. |

---

## Tecnologias

- Java 21

## Referências

- https://refactoring.guru/design-patterns
- https://en.wikipedia.org/wiki/Design_Patterns