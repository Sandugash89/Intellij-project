package class21.HW;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent,
    CollegeStudent, SchoolStudent. Define common behavior within parent class
     and override some of the methods in child classes
     Define some methods specific to child classes
     Write example of achieving run time polymorphism*/
    void study(){
        System.out.println("Students study");
    }
    void read(){
        System.out.println("Students read");
    }
    void write(){
        System.out.println("Students write");
    }

}
class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("Study online");;
    }

    @Override
    void write() {
        System.out.println("Write in Intellij");;
    }

    @Override
    void read() {
        super.read();
    }

    void onlineStudy(){
        System.out.println("Syntax student study online");
    }
}
class CollegeStudent extends Student{
     void goToCollege(){
         System.out.println("Students go to college");
    }

    @Override
    void write() {
        System.out.println("Students write lection");
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void study() {
        super.study();
    }
}
class SchoolStudent extends Student{
    @Override
    void study() {
        System.out.println("Study in the School");
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void write() {
        System.out.println("Students write essey");
    }
    void go(){
        System.out.println("Students go to School");
    }
}

