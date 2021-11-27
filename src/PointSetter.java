import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {

        Point location = new Point(4, 13);
        Point location2 = location; // location2 wskazuje na to samo co location

        System.out.println("Polożenie początkowe:");
        System.out.println("x = " + location.x);
        System.out.println("y = " + location.y);

        System.out.println();

        System.out.println("Przejśćie do (7, 6)");
        location.x = 7;
        location.y = 6;
        System.out.println("Polożenie koncowe:");
        System.out.println("x = " + location.x);
        System.out.println("y = " + location.y);
    }
}
