package pattern.behavioral.memento;

import java.io.*;

public class App {
    void save(Car c) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.obj"));
        oos.writeObject(c);
        oos.close();
    }

    Car restore() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.obj"));
        Car car = (Car)ois.readObject();
        return car;
    }

    public static void main(String[] args) {
        App app = new App();
        Car car = new Car("현대 소나타","43가2876");
        try {
//            app.save(car);
            Car rcar = app.restore();
            System.out.println(rcar.model+" / "+rcar.number);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}