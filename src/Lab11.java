public class Lab11 {
    public static void main(String[] args) {
        new B(false);
    }
}
class A{
    public A() {
        System.out.println("Konstruktor A");
    }
    public A(boolean isSilent) {
        if (!isSilent){
            System.out.println("Konstruktor A (boolean)");
        }
    }
}
class B extends A{
    public B() {
        System.out.println("Konstruktor B");
    }
    public B(boolean isSilent) {
    super(true);
        if (!isSilent){
            System.out.println("Konstruktor B (boolean)");
        }
    }
}
class C extends B{
    public C() {
        System.out.println("Konstruktor C");
    }
    public C(boolean isSilent) {
    super(true);
    if (!isSilent){
        System.out.println("Konstruktor C (boolean)");
    }
    }
}
