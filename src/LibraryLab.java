public class LibraryLab {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Pan samochodzik i złota rękawica", "Zbigniew", "Siedmioróg", 2018),
                new Book("Pan samochodzik i złota rękawica", "Zbigniew", "Siedmioróg", 2018),
                new Book("Pan samochodzik i templariusze", "Zbigniew", "Siedmioróg", 2017),
        };
        Book book1 = books[0];
        Book book2 = books[1];
        Book book3 = books[2];

        System.out.println("Ksiązka1: " + book1);
        System.out.println("Ksiązka3: " + book3);

        if (book1.equals(book3)){
            System.out.println("To ta sama ksiązka");
        } else {
            System.out.println("To są dwie rózne ksiązki");
        }
    }
}
