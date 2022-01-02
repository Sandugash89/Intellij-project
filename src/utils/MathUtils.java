package utils;

public class MathUtils {
    public static double round(double value, int decimalpoint){
        //using the pow () method
        value=value+Math.pow(10, decimalpoint);
        value= Math.floor(value);
        value=value/Math.pow(10,decimalpoint);
        System.out.println(value);
        return value;
}}
