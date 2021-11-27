public class OperatorsDemo {
    public static void main(String[] args) {

       // int x = 5;
       // x += 2; // x + = 2

       // int a = 7;
       // int b = 2;

        // System.out.println(a + b);

        // System.out.println(5 / 3.);

        // System.out.println(5 % 3); // zostaje reszta z dielenia

       // int a = 5;
       // int b = -5;
       // System.out.println(b);

        // inkrementacja, dekrementacja

        // int x, y, z;
        //x = 42;
        // x = x+ 1;
        // x +=1;
        // x++;
       // x--;

       // int a = 0;
       // int b;

        /*int a = 10;
        int b = 10;

        boolean equal = (a == b);

        System.out.println(equal); */

        // operatory relacji
        //  >
        //  <
        //  >=
        //  <=
        //  ==
        //  !=

        //--------------------

        // operatory logiczne
        // negacja!
        // koniukcja  && (and)
        // alternatywa || (or)
        // rownoważność  ==
        // alternatywa rozlączna(XOR) !=

        /*int x = 0;
        int y = 5;

        boolean test = (x < 0) & ( y++ > 3); //
        System.out.println(test);
        System.out.println(y);*/

       /* int age = 33;
        boolean test = !(age < 25);

        System.out.println(test); */
// ----------------------------------------------------
        // operatory bitowe
        // & - iloczyn bitowy
        // | - suma bitowa
        // ^ - XOR (exlusive OR)
        // ~ - negacja bitowa
        // << - przesunięcie w lewo
        // >> - przesunięcie w prawo
/*
        int a = 1; // 00001
        int b = 5; // 00101

        // iloczyn
        System.out.println(~a);
        System.out.println(String.format("%32s",Integer.toBinaryString(a)).replace(' ', '0'));
       // System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(~a)).replace(' ', '0'));*/

        // ^ - XOR
        // 1 1 - 0
        // 1 0 - 1
        // 0 1 - 1
        // 0 0 - 0


        // ----------- liczba ujemna

        // -1
        // 0 0 0 1
        // 1 1 1 0  + 1
        // 1 1 1 1

      /*  System.out.println(Integer.toBinaryString(-1));*/

        //-------------------
        // [przesunięcie w lewo

        int a = 1; // 00001
        int b = 5; // 00101
        System.out.println(a << 5);
        System.out.println(String.format("%32s",Integer.toBinaryString(a)).replace(' ', '0'));
              System.out.println("------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(a << 5)).replace(' ', '0'));




    }
}
