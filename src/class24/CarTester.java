package class24;

public class CarTester {
    public static void main(String[] args) {
      Sedan sedan =new Sedan();
      sedan.length=14;
      sedan.carPrice=5000;
      sedan.calculatePrice();
      Truck truck =new Truck();
      truck.weight=2000;
      truck.carPrice=10000;
      truck.calculatePrice();
    }

}
