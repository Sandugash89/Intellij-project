package class24.interfaceDemo;

public abstract interface Person {
    //private void eat();
    //protected void eat();
    void eat();
    void sleep();
}
interface Employee {
    void work();
}
interface SyntaxEmployees extends Employee, Person{
    void teach();
}
class SDETinstructor implements SyntaxEmployees {
    public void eat() {
        System.out.println("Syntax Employees eating");
    }

    public void sleep() {
        System.out.println("Syntax Employee eating");
    }

    public void work() {
        System.out.println("Creating new repl");
    }

    public void teach() {
        System.out.println("Syntax Employee sleeping");
    }
}
