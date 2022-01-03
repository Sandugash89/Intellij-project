package class26;

import java.util.ArrayList;

public class ArrayDemo3 {
    public static void main(String[] args) {
        ArrayList<String> subject=new ArrayList<>();
        ArrayList<String> subject1=new ArrayList<>();
        ArrayList<String> subject2=new ArrayList<>();
        ArrayList<String> subject3=new ArrayList<>();
        ArrayList<String> subject4=new ArrayList<>();
        ArrayList<String> subject5=new ArrayList<>();
        ArrayList<ArrayList<String>> arrayListArrayList= new ArrayList<>();
        arrayListArrayList.add(subject);
        arrayListArrayList.add(subject1);
        arrayListArrayList.add(subject2);
        arrayListArrayList.add(subject3);
        arrayListArrayList.add(subject4);
        arrayListArrayList.add(subject5);
        System.out.println(arrayListArrayList);


    }
}
