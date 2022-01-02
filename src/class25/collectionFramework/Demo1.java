package class25.collectionFramework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

    /*
    1) Arrays is fixing size

     */
    String name="Hasim";
    String name2 ="Ahmet";
    String[] names = {"Maryam","Amran"};

    // names[2]="Mohammad"; // can not add more than two elements
    ArrayList<String> listofNames=new ArrayList<>();
    listofNames.add("Sandu");
    listofNames.add("Baus");
    listofNames.add("Evelin");
        System.out.println(listofNames.size());
        listofNames.remove("Baus");
        System.out.println("Size of listnames "+ listofNames.size());
}}
