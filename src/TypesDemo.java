public class TypesDemo {
    public static void main(String[] args) {

        // liczby calkowite
        // byte - 1   00000000

        // short - 2  000000000 00000000

        // int - 4    000000000 00000000 000000000 00000000

        // long - 8   000000000 00000000 000000000 00000000 000000000 00000000 000000000 00000000
        byte b = 120;

        short s = 1203;

        int i = 1_203_423_423;

        long l = 123123123123123L;

        // typy zmiennoprzecinkowe
        double a = 34.54454313543459814;

        float f = 1.4f;

        // typy znakowe
        char c = 'a';

        //typy logiczne
        boolean chosen = true;
        boolean isBigger = b > 7;

        // ----------------------------------
        // ciągi znaków
        String name = "Ala";


        System.out.println ("Cześć, jestem " + name); //konkatynacja
        System.out.println("tekst " + (1 + 2));
        System.out.println( 1 +2 + " tekst ");



    }
}
