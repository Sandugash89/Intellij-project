package class19.HW;

public class Shape {
    int radius;
    Shape(){
    }
    Shape(int radius){
        this.radius=radius;
            }
}
class Circle extends Shape{
    Circle(int radius){
        super(radius);
    }
    double calculateArea(){
        return 2*Math.PI*radius*radius;

    }}
    class Test{
        public static void main(String[] args) {
            Circle object = new Circle(3);
            System.out.println((int)object.calculateArea());


        }}

