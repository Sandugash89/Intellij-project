package class25.task1;

public interface Shape {
      /*Create an Interface 'Shape' with undefined methods as calculateArea and calculate
      Perimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
     Test your code */
    void calculateArea(double a); // already public // can not make private, protected
    void calculatePerimeter(double a);

}
class Circle implements Shape{
    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of circle "+(Math.PI*Math.pow(radius,2)));

    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("Perimeter of circle "+change(Math.PI*radius,2));

    }
    static double change(double value, int decimalpoint){
        //using the pow () method
        value=value+Math.pow(10, decimalpoint);
        value= Math.floor(value);
        value=value/Math.pow(10,decimalpoint);
        System.out.println(value);
        return value;


    }}
class Square implements Shape {

    @Override
    public void calculateArea(double length) {

        System.out.println("Area of square " + change(length + length, 2));
    }


    @Override
    public void calculatePerimeter(double lenght){
        System.out.println("Perimeter of square " + change(4 * lenght, 2));

    }
    static double change(double value, int decimalpoint) {
        //using the pow () method
        value = value + Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);
        System.out.println(value);
        return value;



    }
}

