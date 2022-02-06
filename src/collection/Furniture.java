package collection;

import java.util.HashSet;
import java.util.Set;

public class Furniture {
    public static void main(String[] args) {


    Chair char1 = new Chair("Adde", "IKEA", 2016);
    Chair char2 = new Chair("Janinge", "IKEA", 2016);
    Chair char3 = new Chair("Adde", "IKEA", 2015);
    Chair char4 = new Chair("Adde", "IKEA", 2016);

       /* System.out.println("char1.equals(char2): " + char1.equals(char2));
        System.out.println("char1.equals(char3): " + char1.equals(char3));
        System.out.println("char1.equals(char4): " + char1.equals(char4));
        System.out.println("char1.equals(null): " + char1.equals(null));*/

        Set<Chair> chairs = new HashSet<>();
        chairs.add(char1);
        chairs.add(char2);
        chairs.add(char3);
        chairs.add(char4);

        System.out.println(chairs);
        chairs.remove(new Chair("Adde", "IKEA", 2016));
        System.out.println(chairs);

    }
}
