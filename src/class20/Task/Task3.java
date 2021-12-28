package class20.Task;

public class Task3 {
    /*
     Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
     */
    static void method(String name, int age){
        System.out.println(name);
    }
    static void method(int age, String name){
        System.out.println(age);
    }
    static void method(String name, int age, double weitgh){
        System.out.println(weitgh);
    }

    public static void main(String[] args) {
        Task3.method("Sandugash", 32);
        Task3.method(32,"Sandugash");
        Task3.method("Sandugash", 32, 107.5);

    }
}
