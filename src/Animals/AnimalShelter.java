package Animals;

import java.util.Random;

public class AnimalShelter {
    private static final int PenNumber = 33;
    public static void main(String[] args) {
        Random random = new Random();

        Animal[] animals =  new Animal[100];
        for (int j = 0; j <animals.length ; j++) {
            int r = random.nextInt(3);
            switch (r){
                case 0: animals[j] = new Pies();
                break;
                case 1: animals[j] = new Kot();
                break;
                case 2: animals[j] = new Humster();
                break;
            }
        }
        for (Animal a: animals){
            System.out.println(a.getType());
        }
        Animal animal = animals[PenNumber - 1];
        System.out.print("W koicu N33 znajduje się: ");
        System.out.print(animal.getType());
        System.out.println(". Wszystkich jest: " + animal.getInstanceNumber());
    }
}
