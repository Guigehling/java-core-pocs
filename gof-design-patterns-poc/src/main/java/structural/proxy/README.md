# Proxy Pattern

POC desenvolvida para demonstrar o padrão de projeto **Proxy**, que fornece um substituto ou intermediário para outro objeto, controlando o acesso a ele.

No contexto de e-commerce, o padrão é utilizado para criar um **proxy de serviço de produtos com cache**, reduzindo chamadas repetidas ao banco de dados.

---

## Conceitos praticados

- Proxy Pattern
- Controle de acesso a objetos
- Cache de dados
- Lazy loading
- Intermediação de chamadas

---

## Objetivos da POC

- Reduzir chamadas repetidas ao serviço real.
- Melhorar performance através de cache.
- Demonstrar controle de acesso ao objeto real.
- Separar responsabilidade de acesso e lógica de negócio.

---

## Principais conceitos aprendidos

- O `ProductServiceImpl` representa o serviço pesado (ex: banco de dados).
- O `ProductServiceProxy` controla o acesso ao serviço real.
- O proxy adiciona cache sem modificar o serviço original.
- O cliente não sabe se está acessando cache ou serviço real.
- O comportamento é transparente para quem consome.

---

## Estrutura do exemplo

- `Product` → Modelo de produto
- `ProductService` → Interface comum
- `ProductServiceImpl` → Serviço real (simula banco de dados)
- `ProductServiceProxy` → Proxy com cache
- `ProxyApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Melhora performance com cache.
- Controla acesso ao objeto real.
- Permite lazy loading.
- Adiciona funcionalidades sem alterar código original.

### Desvantagens

- Aumenta complexidade.
- Pode mascarar comportamento real do sistema.
- Introduz camada extra de indireção.

---

## Quando utilizar

- Cache de consultas frequentes.
- Controle de acesso (segurança).
- Logging e monitoramento.
- Lazy loading de recursos pesados.

---

## Referências

- https://refactoring.guru/design-patterns/proxy
- https://www.baeldung.com/java-proxy-pattern