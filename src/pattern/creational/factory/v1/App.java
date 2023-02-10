package pattern.creational.factory.v1;

public class App {
    public static void main(String[] args) {
        Vehicle v = VehicleFactory.createNew(Vtype.Truck);
        v.go();
    }
}
