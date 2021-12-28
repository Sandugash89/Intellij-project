package class22.HW;

public class Computer {
    // /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //    Define common behavior within and some fields in parent class and override some of the methods in child classes
    //    Define some methods specific to child classes Create objects of child classes and store them into array.
    //    Loop through each object and execute available methods.

    String name;
    String Ram;
    String OpSystem;
    Computer(String name, String Ram, String OpSystem){
        this.name=name;
        this.Ram=Ram;
        this.OpSystem=OpSystem;
    }
    void printInfo(){System.out.println(name+" is having "+OpSystem+" with "+Ram+" Ram.");}
}
class Apple extends Computer{
    Apple(String name, String Ram, String OpSystem){super(name,Ram,OpSystem);}
    void printInfo() {super.printInfo();}
    void AppleStyle(){System.out.println(name+" has its own unique operating system");}
}
class Lenovo extends Computer{
    Lenovo(String name, String Ram, String OpSystem) {super(name, Ram, OpSystem);}
    void printInfo() {super.printInfo();}
    void LenovoStyle(){System.out.println(name+" has a very stylish design");}
}
class HP extends Computer{
    HP(String name, String Ram, String OpSystem) {super(name, Ram, OpSystem);}
    void printInfo() {super.printInfo();}
    void HPStyle(){System.out.println(name+" is very popular among youngsters");}
}
class Dell extends Computer {
    Dell(String name, String Ram, String OpSystem) {super(name, Ram, OpSystem);}
    void printInfo() {super.printInfo();}
    void DellDurable(){System.out.println(name+" has very durable notebooks");}
}
