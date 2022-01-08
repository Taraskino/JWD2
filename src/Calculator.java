public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int w = c.add(1,2);
        double w2 = c.add (1,2,3);
        System.out.println(w);
        System.out.println(w2);
    }
static int add(int a, int b){
        return a + b;
}
static double add(double a, double b, double c){
        return a + b + c;
}
}


