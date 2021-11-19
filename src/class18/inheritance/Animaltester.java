package class18.inheritance;

public class Animaltester {
    public static void main(String[]args){
        Dog dog=new Dog();

        dog.name="Boby";
        dog.bark();
        dog.eat();

        Cat cat =new Cat();

        cat.name="Mia";
        cat.meow();

        System.out.println(dog.name);


    }
}
