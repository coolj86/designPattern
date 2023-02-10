package pattern.creational.prototype.v4;

import java.util.ArrayList;
import java.util.List;


public class FirmwareSubject {

    List<Observer> observers = new ArrayList<>();

    public void addSubscribe(Observer observer) {
        observers.add(observer);
    }

    void notifySubscribers(String context) {
        observers.forEach(s -> s.update(context));
    }

    void addNews(String context) {
        System.out.println("#펌웨어가 추가됨 에 새로운 소식 추가됨!!");
        notifySubscribers(context);
    }
}
