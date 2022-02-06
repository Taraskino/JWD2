package lambda;

import java.io.InterruptedIOException;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MyFirstLambda {
    public static void main(String[] args) {
        Multiplier m = x -> x * x;
        System.out.println(m.preform(2));

        Introducer i = name -> System.out.println("Cześć, mam mna imię " + name);
        i.run("Wojtek");
        i.run("Agata");

        UnaryOperator<Integer> ua = o -> o * o;
        System.out.println(ua.apply(3));

        Consumer c = o -> System.out.println("Cześć, mam mna imię " + o);
        c.accept("Antek");
    }
}

@FunctionalInterface
interface Multiplier{
    int preform(int x);
}

@FunctionalInterface
interface Introducer{
    void run(String name );
}