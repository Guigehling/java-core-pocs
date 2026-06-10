# Date Time API + Joda-Time POC

POC desenvolvida para estudar as principais funcionalidades da API de datas e horas do Java (`java.time`) e conhecer o funcionamento do `Joda-Time`, biblioteca que inspirou sua criação e ainda pode ser encontrada em sistemas legados.

## Conceitos praticados

- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- `Instant`
- `ZonedDateTime`
- `ZoneId`
- `DateTimeFormatter`
- `Period`
- `Duration`
- `ChronoUnit`
- Conversão entre `LocalDateTime` e `Instant`
- Conversão entre fusos horários (`ZoneId`)
- Conversão entre `java.util.Date` e `LocalDateTime`
- Operações `plus()` e `minus()`
- Parse e formatação de datas
- Introdução ao `Joda-Time`
- Comparação entre `java.time` e `Joda-Time`

## Objetivos da POC

- Compreender a API moderna de datas do Java (`java.time`)
- Aprender a manipular datas e horários de forma imutável
- Realizar operações de soma e subtração de períodos
- Trabalhar com diferentes fusos horários
- Converter entre tipos modernos e APIs legadas
- Calcular diferenças entre datas utilizando `ChronoUnit`
- Entender quando utilizar `java.time` e quando encontrar `Joda-Time`

## Principais conceitos aprendidos

- `LocalDate` representa apenas uma data.
- `LocalTime` representa apenas um horário.
- `LocalDateTime` representa data e hora sem considerar fuso horário.
- `Instant` representa um instante absoluto no tempo (UTC).
- `ZonedDateTime` representa uma data e hora considerando um fuso horário específico.
- `ZoneId` permite trabalhar com diferentes regiões e fusos horários.
- `DateTimeFormatter` facilita a formatação e conversão entre texto e objetos de data.
- `Period` calcula diferenças em anos, meses e dias.
- `Duration` calcula diferenças entre horários ou instantes.
- `ChronoUnit` fornece cálculos rápidos entre datas e horários, como dias, meses, anos, horas e minutos.
- A conversão entre `LocalDateTime` e `Instant` exige um `ZoneId`.
- A conversão entre `java.util.Date` e `LocalDateTime` é comum em aplicações legadas.
- `java.time` é a API oficial do Java desde o Java 8 e substitui o uso do `Joda-Time` em novos projetos.
- `Joda-Time` continua relevante para manutenção de sistemas antigos, mas não é recomendado para novos desenvolvimentos.

## Tecnologias

- Java 21

## Vantagens e Desvantagens

### Java Date Time API (`java.time`)

#### Vantagens

- Faz parte da JDK, sem necessidade de bibliotecas externas.
- API moderna, imutável e thread-safe.
- Melhor integração com o restante da plataforma Java.
- Possui suporte oficial e evolução contínua.
- Recomendada para todos os novos projetos.

#### Desvantagens

- Pode exigir conversões ao integrar com APIs antigas que utilizam `java.util.Date`.

### Joda-Time

#### Vantagens

- API madura e intuitiva.
- Muito utilizada em aplicações desenvolvidas antes do Java 8.
- Ainda presente em diversos sistemas legados.

#### Desvantagens

- Necessita de dependência externa.
- Não é mais recomendada para novos projetos.
- Grande parte de suas funcionalidades foi incorporada pela API `java.time`.

## Referências

- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/package-summary.html
- https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
- https://www.baeldung.com/java-8-date-time-intro
- https://www.baeldung.com/java-date-to-localdate-and-localdatetime
- https://www.joda.org/joda-time/
- https://www.joda.org/joda-time/userguide.html