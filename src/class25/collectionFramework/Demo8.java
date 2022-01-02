package class25.collectionFramework;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subject1 =new ArrayList<>();
        subject1.add("SDLC");
        subject1.add("Manual Testing");
        subject1.add("Java");
        subject1.add("Git");
        subject1.add("Sql");
        subject1.add("APIs");
        subject1.add("Docker");
        subject1.add("AWS");
        subject1.add("Mobile Testing");
        subject1.add("Mock Interview");
        ArrayList<String> subject2 =new ArrayList<>();
        subject2.add("Docker");
        subject2.add("AWS");
        subject2.add("Mobile Testing");
        subject2.add("Mock Interview");
        System.out.println(subject1);
        subject1.removeAll(subject2);
        System.out.println(subject1);
    }
}
