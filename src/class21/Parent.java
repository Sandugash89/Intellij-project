package class21;

public class Parent {
    void method(int num){
       System.out.println("From Parent");
    }
}
class Child extends Parent {

  void method(int num) {
      System.out.println("From Child");
  }
    void method(String name) {
        System.out.println("From Child");
   /* @Override
    void method(int num) {
        System.out.println(num); // can not decrease the visibility
    }
    @Override
   protected void method(int num) {
        System.out.println(num); // can not decrease the visibility
    }*/
    }}

 class Tester{
    public static void main(String[] args) {
        Child child= new Child();
          child.method(10);
    }
}