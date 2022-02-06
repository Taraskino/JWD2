package Animals;

    public class Pies extends Animal{
    private static String type = "pies";
    private static int counter;

    public Pies() {
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
