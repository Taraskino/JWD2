package Zajęcie_4;

public class Lab_17ST {
    public static void main(String[] args) {
        Lab_17Test t1 = new Lab_17Test(Lab_17.NE);
        System.out.println(t1 + " - " + t1.getDirection().getCardinalDirection() + " a to po polsku: " + t1.getDirection().getCardinalDirectionPl());
    }
}
