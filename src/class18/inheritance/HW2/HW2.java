package class18.inheritance.HW2;

public class HW2 {
    /*
    2) Write program to inherit class A that has method printF which is static
and call or reuse that method into class B
     */
    public static void main(String[] args) {
        B.printF();
    }
}
class A {
    static void printF(){
        System.out.println("printF from A");
    }

}
class B extends A{

}

