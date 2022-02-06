package Animals;

    public class Kot extends Animal{
    private static String type = "kot";
    private static int counter;

    public Kot() {
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
