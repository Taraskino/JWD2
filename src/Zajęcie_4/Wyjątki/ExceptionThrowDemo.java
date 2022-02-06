package Zajęcie_4.Wyjątki;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo exceptionThrowDemo = new ExceptionThrowDemo();
        int hours = 3;
        int seconds = 0;
        try {
            seconds = exceptionThrowDemo.getSeconds(hours);
        } catch (IllegalArgumentException e){
            System.out.println("UWAGA! Kprekta denych wejsciowych");
            seconds = exceptionThrowDemo.getSeconds( hours * -1);
        }
        System.out.println(seconds);
    }
    public int getSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Wartość godzin musi być >= 0: " + hours);
        }
        return hours * 60 * 60;
    }
}
