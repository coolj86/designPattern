package pattern.behavioral.memento;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    String number;

    public Car(String model, String number) {
        this.model = model;
        this.number = number;
    }
}