package Labo_18.b;

import java.util.HashMap;
import java.util.Map;

public class UserCollector {
    public static void main(String[] args) {
        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(1, new User("Jan", "Kowalski", 25));
        userMap.put(2, new User("Tomasz", "Pietrowski", 12));
        userMap.put(3, new User("Agata", "Nowak", 33));
        userMap.put(4, new User("Jan", "Kowalski", 25));
        userMap.put(5, new User("Jan", "Kowalski", 25));
        userMap.put(6, new User("Agata", "Nowak", 33));
        userMap.put(4, new User("Agata", "Nowak", 33));

        for( Integer id : userMap.keySet()){
            System.out.println(id + " - " + userMap.get(id));
        }
        System.out.println();

        System.out.println(userMap.get(1));
        System.out.println(userMap.get(4));
    }
}
