package class23.abstraction;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "X3","Sedan","132K");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.start();
        bmw.drive();
        bmw.stop();

        Vehicle toyota = new Toyota("Toyota", "Prius", "Sedan","2341K");
    }
}
