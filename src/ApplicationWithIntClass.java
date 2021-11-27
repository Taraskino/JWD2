public class ApplicationWithIntClass {
    public static void main(String[] args) {
    WithIntClass my = new WithIntClass();
    my.height = 10;
    my.depth = 20;
    my.width = 30;
        System.out.println("Wysokosć to:  "+ my.height );
        System.out.println("Glębokość to: "+ my.depth);
        System.out.println("Szerokość to: "+ my.width);
    }
}
