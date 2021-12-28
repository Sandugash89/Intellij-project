package class20.HW;

public class task2 {
    /*
    * /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/
    public static void main(String[] args) {
        CreditCard credit = new CreditCard(100);
        credit.calculateInterest();
        Visa visa =new Visa(200);
        visa.calculateInterest();
        Ax ax= new Ax(300);
        ax.calculateInterest();

    }
}

class CreditCard{
   double balance;
   double interest;
   CreditCard(double balance){
       this.balance=balance;
   }
   void calculateInterest(){
       interest=balance*0.15;
       System.out.println(interest);
       System.out.println(balance);

   }

}
class Visa extends CreditCard{
    Visa(double balance){
        super(balance);
    }

    @Override
    void calculateInterest() {
        interest=balance*0.05;
        System.out.println(interest);
    }
}
class Ax extends CreditCard{
    Ax(double balance){
        super(balance);
    }


    }
