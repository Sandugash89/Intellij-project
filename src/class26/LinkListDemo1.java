package class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");
        System.out.println(subjects);
        subjects.set(2,"Pyton");
        System.out.println(subjects);

    }
}
