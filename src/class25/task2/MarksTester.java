package class25.task2;

public class MarksTester {
    public static void main(String[] args) {
        A a =new A(97,95,93);
        System.out.println(a.getPercentage());
        B b =new B(91,97,96,89);
        System.out.println(b.getPercentage());

        Marks[]marks={new A(95,94,93),new B(92,91,90,89)};
   for(Marks m :marks){
       System.out.println(m.getPercentage());
   }
    }
}
