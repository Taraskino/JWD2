package Zajęcie_4.Laboratorium_17;

public class ComplTest {
    public static void main(String[] args) {
        double x = 7;
        double y = 4;
        System.out.println("Dodawanie: " + Computation.ADD.perfoorm(x,y));
        System.out.println("Odejmpowanie: " + Computation.SUBTRACT.perfoorm(x,y));
        System.out.println("Mnozenie: " + Computation.MULTIPLY.perfoorm(x,y));
        System.out.println("Dzielenie: " + Computation.DIVIDE.perfoorm(x,y));
    }
}
