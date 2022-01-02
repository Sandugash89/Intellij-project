package class25.collectionFramework;

public class Demo3 {
    public static void main(String[] args) {
        int primitiveNumber=10;
        Integer classNumber=primitiveNumber;
        System.out.println(classNumber);

        Integer number =new Integer(10); // boxing putting a primitive inside a wrapper
        Integer number2=10; // auto inboxing
        int another=number.intValue(); // unboxing longer way
        int another2=number2; // auto unboxing shorter way
    }
}
