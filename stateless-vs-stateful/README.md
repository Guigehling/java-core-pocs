# Stateless vs Stateful POC

POC desenvolvida em Java 21 com o objetivo de explorar e comparar as diferenças práticas entre os designs **Stateless** (sem estado) e **Stateful** (com estado), abordando ciclo de vida de objetos, gerenciamento de estado mutável e concorrência (*thread safety*).

## Objetivos

Durante esta POC foram estudados os seguintes conceitos:

- Compreensão das diferenças entre modelos Stateful e Stateless
- Gerenciamento e encapsulamento de estado mutável em memória
- Reutilização segura de instâncias em serviços Stateless
- Impactos do estado compartilhado em ambientes multithread
- Aplicação de mecanismos de sincronização para garantir *thread safety*
- Modelagem de domínio imutável utilizando Records

## Abordagens implementadas

- **Stateful (`ShoppingCart`)**: Mantém estado interno (itens do carrinho) entre chamadas sucessivas. Cada operação (`addProduct`, `removeProduct`, `clear`) modifica diretamente o estado da instância.
- **Stateful com Thread Safety (`ThreadSafeShoppingCart`)**: Demonstração de proteção de estado compartilhado e mutável através do uso de métodos sincronizados (`synchronized`).
- **Stateless (`OrderCalculator`)**: Serviço sem atributos ou estado de instância; cada método recebe todos os parâmetros necessários para execução, permitindo que a mesma instância seja compartilhada com segurança por múltiplas threads.

## Conceitos praticados

- `Stateful Design` (estado mutável interno e ciclo de vida por contexto/sessão)
- `Stateless Service` (operações determinísticas e reutilização de instâncias)
- `Shared Mutable State` e concorrência
- `Thread Safety` (`synchronized`)
- `Java Records` (`Product`, `OrderItem` para representação imutável de dados)
- `Cópia defensiva` (`List.copyOf`)
- `Stream API` para agregações e cálculos

## Tecnologias

- Java 21

## Referências

- https://www.baeldung.com/cs/stateless-vs-stateful-architecture
- https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
- https://en.wikipedia.org/wiki/Stateless_protocol
