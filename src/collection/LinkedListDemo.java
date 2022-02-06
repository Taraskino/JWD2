package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> elements = new LinkedList<>();
        elements.add("pierwszy");
        elements.add("drugi");
        elements.add("drugi");
        elements.add("trzeci");
        elements.add("czwarty");

        elements.add(0, "zerowy");
        elements.remove("drugi");

        System.out.println(elements);
    }
}
