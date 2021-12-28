package class20.methodOverriding;

public class Parent {
    String name ="Sadat";
    void printName(){
        System.out.println("Name is "+name);
    }
    void getmarried(){
        System.out.println("Ahmet will get marry by my choice");
    }
}
class Child extends Parent{
    String name="Ahmet";

    void printName() {
        String name = "Sharif";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override
    void getmarried() {
        System.out.println("But I like someone else");
    }
void letsDoSomethingCrazy(){
        super.getmarried();
        getmarried();
}
    public static void main(String[] args) {
        Child child =new Child();
        child.getmarried();
        child.printName();
    }

}
