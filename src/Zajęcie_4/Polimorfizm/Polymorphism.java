package Zajęcie_4.Polimorfizm;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.Drope();
        Rectangle rectangle = new Rectangle();
        rectangle.Drope();

        System.out.println(shape instanceof Rectangle);
        shape = new Rectangle();
        shape = new Circle();
        //Triangle t = new Shape();
        shape.Drope();

    }
}
