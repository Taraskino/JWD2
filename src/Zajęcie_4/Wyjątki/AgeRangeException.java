package Zajęcie_4.Wyjątki;

public class AgeRangeException extends ArithmeticException{
    public AgeRangeException() {
    }

    public AgeRangeException(String s) {
        super(s);
    }
}
