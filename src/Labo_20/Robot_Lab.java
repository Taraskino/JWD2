
package Labo_20;


public class Robot_Lab {

    public static class Robot {
        private final GreetingModuleNEW greetingModule;

        public Robot(GreetingModuleNEW greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }

    public interface GreetingModuleNEW {
        void sayHello();
    }


    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModuleNEW() {
            @Override
            public void sayHello() {
                System.out.println("Dzień Dobry");

            }
        });

        Robot john = new Robot(new GreetingModuleNEW() {
            @Override
            public void sayHello() {
                System.out.println("Good Morning");
            }
        });
        Robot minato = new Robot(new GreetingModuleNEW() {
            @Override
            public void sayHello() {
                System.out.println("Ohayo watashi wa Gundam desu");
            }
        });

        Robot[] robots={jan, john, minato};
        for (Robot robot: robots){
            robot.saySomething();
        }

    }
}