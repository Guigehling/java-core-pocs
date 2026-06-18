# Prototype Pattern

POC desenvolvida para demonstrar o padrão de projeto **Prototype**, que permite criar novos objetos a partir da clonagem de instâncias existentes, evitando a criação repetitiva de objetos complexos do zero.

No contexto de e-commerce, o padrão é utilizado para reutilizar **modelos base de pagamento**, como Pix e Cartão de Crédito, criando novas transações a partir de um protótipo já configurado.

## Conceitos praticados

- Prototype Pattern
- Clonagem de objetos
- Reuso de instâncias pré-configuradas
- Redução de custo de criação de objetos
- Herança e polimorfismo

## Objetivos da POC

- Demonstrar a criação de objetos via clonagem.
- Evitar recriação repetitiva de configurações comuns.
- Reutilizar “modelos base” de pagamento.
- Reduzir complexidade na criação de objetos semelhantes.

## Principais conceitos aprendidos

- Um objeto pode ser clonado para gerar novos objetos.
- O protótipo contém uma configuração base reutilizável.
- Após o clone, o objeto pode ser customizado.
- O método `clone()` é responsável por duplicar o objeto.
- Evita criação repetitiva com `new`.

## Estrutura do exemplo

- `PaymentTemplate` → Classe base com suporte a clonagem
- `PixPaymentTemplate` → Protótipo de pagamento via Pix
- `CreditCardPaymentTemplate` → Protótipo de pagamento via cartão de crédito
- `PrototypeApp` → Demonstração do uso do padrão

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Reduz custo de criação de objetos complexos.
- Reutiliza configurações padrão.
- Evita duplicação de código de inicialização.
- Pode melhorar performance em objetos pesados.

### Desvantagens

- Pode ser difícil gerenciar clones profundos (deep copy).
- Uso de `clone()` pode ser confuso em Java.
- Pode gerar acoplamento com estrutura interna do objeto.
- Risco de efeitos colaterais em cópias compartilhadas.

## Quando utilizar

- Quando objetos são caros de criar.
- Quando existem muitos objetos semelhantes.
- Quando você precisa de cópias rápidas de estados pré-configurados.
- Em sistemas com templates, presets ou configurações base.

## Referências

- https://refactoring.guru/design-patterns/prototype
- https://www.baeldung.com/java-pattern-prototype