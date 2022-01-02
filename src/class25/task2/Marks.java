package class25.task2;

import utils.MathUtils;

public  abstract class Marks {
     /*We have to calculate the average of marks obtained in three subjects
     by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage'
    that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in
    three subjects as its parameters and the marks in four subjects as its parameters for student B.
    Test your code*/
    double course1Marks;
    double course2Marks;
    double course3Marks;



    public Marks(double course1Marks,double course2Marks, double course3Marks){
        this.course1Marks=course1Marks;
        this.course2Marks=course2Marks;
        this.course3Marks=course3Marks;
    }
    abstract double getPercentage();

}
class A extends Marks{
    public A(double course1Marks,double course2Marks, double course3Marks){
        super(course1Marks,course2Marks,course3Marks);
    }
    double getPercentage(){
        return (course1Marks+course2Marks+course3Marks)/3;
    }
}
class B extends Marks{
    double course4Marks;

    public B(double course1Marks, double course2Marks, double course3Marks, double courseMarks) {
        super(course1Marks, course2Marks, course3Marks);
        this.course4Marks=courseMarks;
    }

    @Override
    double getPercentage() {
        return (course4Marks+course3Marks+course2Marks+course1Marks)/4;
    }
}
