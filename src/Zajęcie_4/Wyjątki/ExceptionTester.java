package Zajęcie_4.Wyjątki;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3};


        try {
            System.out.println("Nasz numer to: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // zapis do logów
            System.out.println("Niema takiego indeksu!");
        }  catch (Exception e) {
            // zapis do logów
            System.out.println("Coś poszło nie tak");
        } finally {
            System.out.println("Koniec");
        }
    }
}
