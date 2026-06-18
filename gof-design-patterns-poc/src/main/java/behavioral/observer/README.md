# Observer Pattern

POC desenvolvida para demonstrar o padrão de projeto **Observer**, que define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados automaticamente.

No contexto de e-commerce, o padrão é utilizado para **disparar eventos de pedidos**, permitindo que múltiplos sistemas reajam automaticamente (estoque, pagamento, notificações e analytics).

---

## Conceitos praticados

- Observer Pattern
- Event-driven architecture
- Desacoplamento entre serviços
- Publicação e assinatura (pub/sub)
- Notificação automática de eventos

---

## Objetivos da POC

- Notificar múltiplos sistemas sobre mudanças de pedido.
- Reduzir acoplamento entre serviços.
- Simular arquitetura orientada a eventos.
- Permitir expansão fácil de novos consumidores de eventos.

---

## Principais conceitos aprendidos

- O `Subject` gerencia os observers.
- Observers são notificados automaticamente.
- Cada observer reage de forma independente.
- O sistema segue modelo publish/subscribe.
- Não há dependência direta entre serviços.

---

## Estrutura do exemplo

- `OrderEvent` → Evento disparado
- `Observer` → Interface dos consumidores
- `Subject` → Gerenciador de eventos
- `OrderEventManager` → Implementação do subject
- `InventoryObserver` → Atualiza estoque
- `PaymentObserver` → Processa pagamento
- `NotificationObserver` → Envia notificações
- `AnalyticsObserver` → Registra métricas
- `ObserverApp` → Demonstração do pattern

---

## Tecnologias

- Java 21

---

## Vantagens e Desvantagens

### Vantagens

- Alto desacoplamento.
- Fácil adicionar novos listeners.
- Base para arquiteturas event-driven.
- Escalável.

### Desvantagens

- Fluxo difícil de rastrear.
- Pode gerar muitos eventos indiretos.
- Debug mais complexo.
- Ordem de execução não garantida.

---

## Quando utilizar

- Sistemas orientados a eventos.
- Notificações automáticas.
- Integração entre serviços.
- Sistemas de auditoria e analytics.
- Arquiteturas reativas.

---

## Referências

- https://refactoring.guru/design-patterns/observer
- https://www.baeldung.com/java-observer-pattern