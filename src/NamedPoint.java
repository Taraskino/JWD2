import java.awt.*;
import java.util.SortedMap;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public void ShowInfo(){
        System.out.println(name + " (" + x + "," + y + ")");
    }

    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5,5, "SMallPoint");
        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("Name wynosi " + np.name);

        System.out.println();

        np.ShowInfo();

        np = new NamedPoint(123,456, "BigPoint");
        np.ShowInfo();


    }
}
