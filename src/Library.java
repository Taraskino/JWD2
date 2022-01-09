public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Misato w ogniu", "Agata", "Kowalski", 1945);
        Book book2 = new Book("Misato imprez", "Francek", "Janusz", 1998);
        Book book3 = new Book("Misato przechów", "Szmigłowski", "Grażyna", 2001);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("-------------------");

        System.out.println("Sprawdzamy przez matodę 'equals':");
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));
        System.out.println("-------------------");

        System.out.println("Sprawdzamy przez matodę 'identityHashCode':");
        System.out.println(System.identityHashCode(book1));
        System.out.println(System.identityHashCode(book2));
        System.out.println(System.identityHashCode(book3));

    }
}
