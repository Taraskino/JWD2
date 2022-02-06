package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListCompareDemo {

    public static final int MAX_VAL = 1_000_000;
        public static void fill(List<Integer> list){
            for (int i = 1; i <= MAX_VAL; i++) {
                list.add(i);
            }
        }

        public static void insertInMiddle(List<Integer> list){
            int half = MAX_VAL / 2;
            int part = MAX_VAL / 10;
            ListIterator iterator = list.listIterator(half);
            for (int i = 1; i<=part; i++) {
                iterator.add(0);
            }
        }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fill(list);

        long startTime = System.currentTimeMillis();
        insertInMiddle(list);
        long totalTime = System.currentTimeMillis() - startTime;

        System.out.println(totalTime + " milisekund");
    }
}
