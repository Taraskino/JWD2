import java.util.Scanner;

public class Lab72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie dwójkowym" +
                "");
        String binary = scanner.nextLine();
        System.out.println("Podana przez ciebie liczba w systemie dsiesiętnym to: "+ Integer.parseInt(binary, 2));
    }
}
