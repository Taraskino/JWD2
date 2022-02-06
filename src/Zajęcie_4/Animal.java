package Zajęcie_4;

import Zajęcie_4.Polimorfizm.Shape;

public class Animal {
    String name;
    public Animal() {
        this.name = "bezimenne";
    }
    String showName(){
        return " zwierze " + name;
    }
    String makeSound(){
        return "???";
    }
    void introduceYuorself(){
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}
