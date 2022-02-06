package Zajęcie_4;

public class Pig extends Animal{
    @Override
    String showName() {
        return "świnka " + name;
    }

    @Override
    String makeSound() {
        return "kwi-kwi ";
    }

    public Pig(String name) {
        this.name = name;

    }
}
