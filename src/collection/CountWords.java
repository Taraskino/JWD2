package collection;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<String> words = new HashSet<>();
        System.out.println("Wpisz dowolne słowa (w) -> wyjście:");


        while (in.hasNext()){
            String word = in.nextLine();
            if (word.equals("w")){
                break;
            }
        words.add(word);
        }
        System.out.println(words.size() + " unikatowych słów");
    }
}
