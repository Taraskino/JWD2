public class Lab5 {
    public static void main(String[] args) {

        float total = 14000F;
        System.out.println("Inwestycja pczątkowa:" + total + "zl");
        total = total +  (total * 0.4F);
        System.out.println("Po pierwszym roku:" + total + "zl");
        total = total +  (total - 1500);
        System.out.println("Po drugim roku:" + total + "zl");
        total = total +  (total * 0.2F);
        System.out.println("Po trzecim roku:" + total + "zl");



    }
}
