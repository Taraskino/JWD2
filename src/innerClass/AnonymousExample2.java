package innerClass;

public class AnonymousExample2 {
    public static void main(String[] args) {
        AnonymousExample anonymousExample = new AnonymousExample();
        anonymousExample.someMethode();
    }
    public void someMethode(){
        GreetingModule greetingModule = new GreetingModuleImpl() {

    };
}
 interface GreetingModule{
    void sayHello();
}

class GreetingModuleImpl implements GreetingModule{
    @Override
    public void sayHello() {
        System.out.println("good morning");
    }

    }
}
