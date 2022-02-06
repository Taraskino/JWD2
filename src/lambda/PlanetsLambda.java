package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        /*Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Arrays.sort(planets, comparator);*/

        Arrays.sort(planets, (o1, o2) ->  o1.length() - o2.length());
       /* for(String planet : planets){
            System.out.println(planet);
        }*/
        Arrays.asList(planets).forEach(System.out :: println);
    }
}
