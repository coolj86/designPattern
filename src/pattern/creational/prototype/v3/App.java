package pattern.creational.prototype.v3;

/**
 * Observer Pattern 적용 버전.
 */
public class App {
    public void start() throws CloneNotSupportedException {
        Car car = new Car();

        Car c1 = (Car) car.clone();
        c1.setName("소나타");
        c1.firmware.add("자동주차 모드");

        Car c2 = (Car) car.clone();
        c2.setName("제네시스");
        printfw(c1);
        printfw(c2);

        // Subject에 Observer 등록(구독)
        FirmwareManager fwmanager = new FirmwareManager();
        fwmanager.addCar(c1);
        fwmanager.addCar(c2);

        fwmanager.newFirmwareReady();
        printfw(c1);
        printfw(c2);

    }

    public void printfw(Car car) {
        System.out.println(car.getName() + "\n=================================");
        car.firmware.forEach(System.out::println);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        App app = new App();
        app.start();
    }
}
