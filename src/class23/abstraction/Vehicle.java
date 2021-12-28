package class23.abstraction;

public abstract class Vehicle {
   // abstract String vin_number; abstract not allowed with fields
    String vinNumber;
    static int totalVehicles;
    /*
    abstract Vehicle(){
    abstract not allowed with constructors\
     */
    Vehicle(String vinNumber){
        totalVehicles++;
        this.vinNumber=vinNumber;
        System.out.println("Grandpas constructor is called");
    }
    public void printVehicleCount(){
        System.out.println(totalVehicles+"Vehicle creating");
    }
    public void drive(){
        System.out.println("Vehicle driving");
    }
    public void stop(){
        System.out.println("Vehicle stopping");
    }
    public abstract void start();

}
abstract class Car extends Vehicle{
    String carType;
    Car(String carType, String vinNumber){
        super(vinNumber);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }
    public void drive(){
        System.out.println("Car is driving");
    }
    public abstract void speed();
    }
    class BMW extends Car{
    String make;
    String model;
    BMW(String make, String model, String carType, String vinNumber){
        super(carType, vinNumber);
        this.make=make;
        this.model=model;
        System.out.println("BMW Constructor");

    }
        @Override
        public void speed() {
            System.out.println("BMW can run 300km/h");
        }
        public void start(){
            System.out.println("BMW can start using remote");
        }
    }
    class Toyota extends Car{
        String make;
        String model;
        Toyota(String make, String model, String carType, String vinNumber){
            super(carType, vinNumber);
            this.make=make;
            this.model=model;
            System.out.println("Toyota Constructor");

        }
        @Override
        public void speed() {
            System.out.println("BMW can run 200km/h");
        }
        public void start(){
            System.out.println("BMW can start using Keys");
        }
        void displayInfo(){
            System.out.println("we build "+make+" model"+model+" "+carType+" "+vinNumber);
        }

    }



