package Zajęcie_4.Wyjątki;

public class AgeTester {
    static void checkAge(int age){
        if (age < 18){
            throw new AgeRangeException("Uwaga! Osoba niepełnolietnia");
        } else {
            System.out.println("Dostępm przyznany");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println("Naruszenie zasad! " + e.getMessage());
        }
    }

}
