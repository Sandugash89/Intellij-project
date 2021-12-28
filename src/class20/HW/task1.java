package class20.HW;

public class task1 {
    /*
      /*Create a class 'Degree' having a method 'getPrerequisite' that prints
    ""To get a degree you need high school diploma"". Class 'Degree' has 2 subclasses
    namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.*/
    public static void main(String[] args) {
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
        Degree degree=new Degree();
        degree.getPrerequisite();

    }
}
    class Degree{
        void getPrerequisite(){

            System.out.println("To get a degree you need high school diploma");
        }
    }
    class Masters extends Degree{
        @Override
        void getPrerequisite() {

            System.out.println("To get a masters you need bachelor degree");
        }
    }
    class Bachelors extends Degree{

        }


