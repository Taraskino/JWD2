package innerClass;

import java.util.Arrays;

public class Outer6 {
    public static void main(String[] args) {
        Outer6.localClassInstantiate(args);
    }
    private static void localClassInstantiate(String[] args){
        class LocalClass{
            public String  toString(){
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }
        LocalClass localClassInstance = new LocalClass();
        System.out.println(localClassInstance);
    }
}
