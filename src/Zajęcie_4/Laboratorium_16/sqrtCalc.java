package Zajęcie_4.Laboratorium_16;

import java.util.Scanner;

public class sqrtCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Bląd! Podana wartość nie jest liczbą.");
            System.exit(-1);
        }

        if (d < 0){
            throw new IllegalArgumentException("Podano liczbe ujemną");
        }
        System.out.println(Math.sqrt(d));

    }
}
