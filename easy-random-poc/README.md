# Easy Random POC

POC desenvolvida para estudar a biblioteca Easy Random, utilizada para geração automática de objetos e massas de dados para testes.

## Conceitos praticados

- Easy Random
- Geração automática de objetos
- Objetos aninhados
- Geração de coleções
- Configuração de parâmetros
- Seed para dados reproduzíveis
- Randomizadores customizados
- Test Data Generation
- Reflection

## Objetivos da POC

- Entender o funcionamento do Easy Random
- Gerar objetos automaticamente para testes
- Reduzir código de setup em cenários de teste
- Explorar a geração de objetos complexos e coleções
- Aprender a customizar a geração de dados
- Compreender limitações da biblioteca com recursos mais recentes do Java

## Principais conceitos aprendidos

- O Easy Random utiliza Reflection para instanciar e popular objetos automaticamente.
- É possível gerar objetos completos com apenas uma chamada utilizando `nextObject()`.
- A biblioteca suporta geração automática de objetos aninhados.
- É possível gerar listas e coleções de objetos através do método `objects()`.
- Configurações podem ser aplicadas utilizando `EasyRandomParameters`.
- Seeds permitem gerar sempre a mesma massa de dados, facilitando testes reproduzíveis.
- Randomizadores customizados permitem controlar valores gerados para tipos específicos.
- A biblioteca foi projetada principalmente para Java Beans tradicionais.
- Records podem apresentar limitações devido à imutabilidade dos atributos (`final`).

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Vantagens

- Reduz significativamente o código de criação de objetos para testes.
- Facilita a geração de massas de dados complexas.
- Suporte para objetos aninhados.
- Permite customização da geração de dados.
- Fácil integração com testes unitários e de integração.
- Possui curva de aprendizado simples.

### Desvantagens

- Suporte limitado para recursos modernos como Records.
- Pode gerar dados irreais sem customizações adequadas.
- Utiliza Reflection, o que pode dificultar depuração em alguns cenários.
- Menos flexível que abordagens específicas para construção de objetos de teste.

## Referências

- https://www.baeldung.com/java-easy-random
- https://github.com/j-easy/easy-random
- https://github.com/j-easy/easy-random/wiki