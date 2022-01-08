public class CalcLab {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int r1 = calculator.add(1, 1);
        System.out.println(" 1 + 1 = " + r1);

        int r2 = calculator.add(1, 2);
        System.out.println(" 1 + 2 + 4 = " + r2);

        double r3 = calculator.add(1.0, 1.0, 5.0);
        System.out.println(" 1 + 1 + 5= " + r3);



    }
    public int add( int a, int b){
        return a + b;
    }
    public int add( int a, int b, int c){
        return a + b + c;
    }
    public double add( double a, double b){
        return a + b;
    }
    public double add( double a, double b, double c){
        return a + b + c;
    }
}
