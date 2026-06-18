package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderEventManager implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(OrderEvent event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void changeOrderStatus(String orderId, String status) {
        System.out.println("\nOrder status changed: " + status);
        notifyObservers(new OrderEvent(orderId, status));
    }

}
