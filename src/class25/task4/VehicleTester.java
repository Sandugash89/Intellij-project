package class25.task4;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle []vehicles={new Sedan(5000, 25),new Truck(10000, 1500)};
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle.calculateSalePrice());
        }
    }
}
