package iteratorPatt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<String> intList = new ArrayList<>();
        HashSet<String> intSet = new HashSet<>();

        intList.add("list1");
        intList.add("list2");
        intList.add("list3");

        intSet.add("set1");
        intSet.add("set2");
        intSet.add("set3");

        Iterator<String> iterator = intList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = intSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
