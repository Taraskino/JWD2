package come.two;

import com.one.A;

public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.number = 1;
        b.name = "Tom";
        System.out.println(b.number);
        System.out.println(b.name);
    }
}
