package class18.inheritance;

public class Dog extends Animal{
    void bark(){
        System.out.println(name+" is  barking");
    }
    boolean loyal=true;
    void printAllInfo(){
        System.out.println(name+breed+color+age+ weight);
}}
