package class26;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
       linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Kiwi");

        System.out.println(linkedHashSet);
        ArrayList<String>arrayList=new ArrayList<>(linkedHashSet);
        System.out.println(arrayList);
        ArrayList<String>hashset2=new ArrayList<>(arrayList);
        System.out.println(hashset2);
    }
}
