# Custom Annotations POC

POC desenvolvida em Java 21 com o objetivo de entender como criar annotations customizadas e processá-las utilizando Reflection API.

## Conceitos praticados

Durante esta POC foram estudados os seguintes recursos:

- Custom Annotations
- `@interface`
- `@Retention`
- `@Target`
- Reflection API
- `Field`
- `getDeclaredField()`
- `isAnnotationPresent()`
- `getAnnotation()`
- `setAccessible(true)`
- Processamento dinâmico de atributos

## Objetivos da POC

A POC demonstrou como:

- Criar annotations customizadas
- Definir onde a annotation pode ser utilizada
- Tornar annotations disponíveis em runtime
- Ler annotations usando Reflection
- Acessar atributos privados
- Criar comportamentos baseados em annotations

## Principais conceitos aprendidos

| Recurso | Objetivo |
|---|---|
| `@interface` | Criar annotation customizada |
| `@Retention(RUNTIME)` | Disponibilizar annotation em runtime |
| `@Target(FIELD)` | Restringir uso em atributos |
| Reflection API | Ler metadados da classe |
| `Field` | Manipular atributos dinamicamente |
| `setAccessible(true)` | Acessar campos privados |
| `getAnnotation()` | Recuperar annotation do atributo |

## Tecnologias

- Java 21

## Referências

- https://www.baeldung.com/java-custom-annotation
- https://faizxmohammed.medium.com/creating-custom-annotations-in-java-with-reflection-and-aop-135e6920668e
- https://www.baeldung.com/java-reflection