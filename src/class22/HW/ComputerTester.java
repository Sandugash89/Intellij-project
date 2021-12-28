package class22.HW;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple("Apple","32gb","Mac"),
                new Lenovo("Lenovo","16gb","Windows"),
                new HP("HP","32gb","Windows"),
                new Dell("Dell","16gb","Windows")};
        for(Computer computer:computers){
            computer.printInfo();
            if(computer instanceof Apple){
                ((Apple) computer).AppleStyle();
            }else if(computer instanceof Lenovo){
                ((Lenovo) computer).LenovoStyle();
            }else if(computer instanceof HP){
                ((HP) computer).HPStyle();
            }else if(computer instanceof Dell){
                ((Dell) computer).DellDurable();
            }
        }
    }
}
