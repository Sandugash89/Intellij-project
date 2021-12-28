package class21;

public class MethodOverLoadingDemo {
    /* public void method(int number){
        System.out.println(number);
        System.out.println("Hello");
        System.out.println("Java");
        // can not overload by just changing the access modifier
    }*/
    /* static void method(int number){
        System.out.println(number);
        System.out.println("Hello");
        System.out.println("Java");
        // can not overload by just puttinh  non access modifier
    }*/
    /* void  method1(int number){
        System.out.println(number);
        System.out.println("Hello");
        System.out.println("Java");
        return ;
        // can not overload, method name have to be same
    }*/
    void method(int number) {
        System.out.println(number);
    }
    void method(String name) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");
    }
   void method(String name, int num) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");
    }
    void method( int num,String name) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");
    }


    public static void main(String[] args) {
        MethodOverLoadingDemo method =new MethodOverLoadingDemo();
        method.method(10);
        method.method("Sandugash");
        method.method("Sandugash",10);
        method.method(10, "Sandugash");

    }
    }

