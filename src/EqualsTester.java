public class EqualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Ala ma kota.";
        str2 = str1;
        System.out.println("String 1 :" +  str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));
        System.out.println("-------------------");

        str2 = new String(str1); // tworzymy nowy obiekt;
        System.out.println("String 1 :" +  str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));
        System.out.println("-------------------");

        // porównywamy wartośći
        System.out.println("Ta sama wartość? " + str1.equals(str2));
        System.out.println("-------------------");

        System.out.println(str1.getClass().getName()); // w ten sposób możemy się dowiedzić jakiej klasy dany obiekt
        System.out.println("-------------------");

        boolean chek1 = "Teksas" instanceof String; // sprawdzamy chy Teksas jest w klasie String
        System.out.println(chek1);
        System.out.println("-------------------");
        Object obj = new Object();
        boolean chek2 = obj instanceof String;
        System.out.println(chek2);
        System.out.println("-------------------");
        boolean chek3 = "jasgfjkag" instanceof Object;
        System.out.println(chek3);



    }
}
