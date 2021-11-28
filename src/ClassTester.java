public class ClassTester {
    int i; //zmienna ekzemplarza (pole klasy)
    static int j = 2; // zmienna klasowa (pole statyczne)

    public int change() {
        int k = 7; //zmienna lokalna
        return i + (k * j);
    }

    public static void main(String[] a) {
        int i = 77;
        ClassTester classTester = new ClassTester();

        System.out.println("Wyswietlam zmienną ekzemplarza i dla obiektu ClassTester: " + classTester.i);
        System.out.println("Wyswietlam zmienną lokalną i: " + i);
        System.out.println("Wyswietlam zmienną klasową (statyczną) j: " +j);



    }
}
