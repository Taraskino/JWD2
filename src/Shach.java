import java.util.Scanner;
public class Shach {
        public static void main(String[] args) {
                System.out.print("Wpisz ilosc pol  szachownicy  = ");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();

                int number = 1;
                int sum = 1;
                System.out.print("Ilość ziarn na " + n + " polach szachownicy= 1");
                 while (number < n) {
                        number ++;
                        sum += number;
                        System.out.print(" + " + number);
                }
                System.out.println(" = " + sum);
        }
}


