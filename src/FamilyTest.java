public class FamilyTest {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        System.out.println("Nazwisko rodu to: " + dad.surName);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surName); // dzieki klasowej zmiennej "static"

        dad.name = "Tomasz";
        dad.age  = 30;
        System.out.println(dad.name + " " + dad.age);

        FamilyMember son = new FamilyMember();
        son.name = "Karol";
        son.age = 7;
        System.out.println(son.surName + " " + son.name + " " + son.age);

        dad.surName = "Kowalski";
        System.out.println(son.surName + " " + son.name + " " + son.age); // dla tego żę surName jest statyczną zmienną calego klasu




    }
}
