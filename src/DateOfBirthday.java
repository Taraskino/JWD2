public class DateOfBirthday {
    public static void main(String[] args) {
        String exDate = "29/04/2016";
        System.out.println("Dzien urodzin to: \t" + exDate.substring(0, 2));
        System.out.println("Miesiąc urodzin to: " + exDate.substring(3, 5));
        System.out.println("Rok urodzin to: \t"  + exDate.substring(6, 10));

    }
}
