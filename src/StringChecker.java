import java.util.Locale;

public class StringChecker {
    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println(" Tekst to: " + str);
        System.out.println("Długość tekstu to: " + str.length());

        // znak na pozycji 6
        // fragment od znaku 10 do 16
        // indeks pierwszej litery t
        // indeks początku tekstu "długi"
        // tekst zapisany wielkimi literami

        System.out.println();
        System.out.println("Znak na pozycji 6 to: " + str.charAt(5)); //dajemy 5 dla tego że zaczyna się liczyć od 0
        System.out.println();
        System.out.println("Fragment od znaku 10 do 16 to: " + "'" + str.substring(10, 16) + "'");
        System.out.println();
        System.out.println("Indeks pierwszej litery t to: " + str.indexOf('t'));
        System.out.println();
        System.out.println("Indeks początku tekstu \"długi\" to: " + str.indexOf("długi"));
        System.out.println();
        System.out.println("Tekst zapisany wielkimi literami to: " + str.toUpperCase(Locale.ROOT));


    }
}
