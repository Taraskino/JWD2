package Animals;

    public class Humster extends Animal    {
    private static String type = "Humster";
    private static int counter;

    public Humster() {
        counter++;
    }

    @Override
    String getType() {
        return type;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }
}

