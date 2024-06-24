package observerPatt;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public Topic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }
    @Override
    public void unregister(Observer obj){
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        if (!changed) {
            return;
        }

        this.observers.forEach(Observer::update);
        changed = false;
    }

    @Override
    public Object getUpdate(Observer obj) {
        // Observer 타입의 매개변수를 받는 이유 : 특정 옵저버 객체에 대한 맞춤형 업데이트를 제공할 수 있다.
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message sended to topic: " + msg);
        message = msg;
        changed = true;
        notifyObservers();
    }
}
