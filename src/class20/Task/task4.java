package class20.Task;

public class task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
     */
    private void method(String name){
        System.out.println(name);
    }
    private int method(int num){
        return 7;

    }
    private double method(double weigth){
        System.out.println(weigth);
        return 5;
    }

    public static void main(String[] args) {
        task4 task4 =new task4();
        task4.method("Sandugash");
        task4.method(4);

        task4.method(105.8);

    }
}
