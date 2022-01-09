package Lab;

public class PackageTesterApp {
    public static void main(String[] args) {
        Lab.Package1.PackageTester pt1 = new Lab.Package1.PackageTester();
        Lab.Package2.PackageTester pt2 = new Lab.Package2.PackageTester();
        Lab.Package3.PackageTester pt3 = new Lab.Package3.PackageTester();

        pt1.introduce();
        pt2.introduce();
        pt3.introduce();

    }
}
