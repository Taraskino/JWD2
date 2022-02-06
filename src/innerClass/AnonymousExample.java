package innerClass;

public class AnonymousExample {
    public static void main(String[] args) {
        AnonymousExample anonymousExample = new AnonymousExample();
        anonymousExample.someMethode();
    }

    public interface GreetingModule{
        void sayHello();
    }

    public void someMethode(){
        GreetingModule greetingModule = new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Good morning!");
            }
        };
        greetingModule.sayHello();
    }
}
