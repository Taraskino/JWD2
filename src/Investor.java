public class Investor {
    public static void main(String[] args) {

        float total = 14000F;
        String currency = " zł ";
        float firstYear = total * 1.4f;
        float secondYear = firstYear - 1500F;
        float thirdYears = secondYear * 1.12F;

        System.out.println(" Wartość inwestycji to: " + thirdYears + currency);

//--------

        int a = 7;
        int b = 5;
        boolean test = ((thirdYears % a) ==0)  && ((thirdYears % b )== 0 );
        System.out.println(" Czy dana liczba " + thirdYears  + " moze byc podzielona bez reszty? ");
        System.out.println(test ? "TAK" : "NIE" );

//--------







    }
}
