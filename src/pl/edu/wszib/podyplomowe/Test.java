package pl.edu.wszib.podyplomowe;

public class Test {
    public static void main(String[] args) {
        System.out.println("pakiet: " + Test.class.getClass().getPackageName());

        PackagePresenter pp1 = new PackagePresenter();
        //pp1.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter pp2 = new pl.edu.wszib.podyplomowe.PackagePresenter();
        //pp1.showPackage();

    }
}
