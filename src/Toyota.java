import java.util.Random;

public class Toyota {
    public static String model;
    public static String color;
    public static int year;
    public static int max;
    public static void Randomowo(){
        Random random = new Random();
        int models = random.nextInt((3)+1);
        if (models == 1) {
            model = "Yaris";
        } else if (models == 2) {
            model = "Corolla";
        } else if  (models == 3){
            model = "Augo";
        }
        int colors = random.nextInt(3+1);
        if (colors == 1) {
            color = "Srebny";
        } else if (colors == 2) {
            color = "Niebeski";
        } else if  (colors == 3){
            color = "Czarny";
        }
        int years = random.nextInt((3)+1);
        if (years == 1) {
            year = 2018;
        } else if (years== 2) {
            year = 2019;
        } else if  (years == 3){
            year = 2020;
        }
    }
    public static void ParkingInMotomachi() {
        max = 5000;
        Toyota[] carInMotomachi = new Toyota[max];
        int count = 0;
        for (int i = 0; i < carInMotomachi.length; i++) {
            Randomowo();
//            System.out.print(i + 1  + " ");
//            System.out.println(model + "\t" + color + "\t" + year);

            if (("Yaris".equals(model)) && ("Srebny".equals(color)) && (year==2020)){
                count ++;
            }
        }
        System.out.println("Na parkingu u Motomachi znajduje się " + count + "  Yarisek w srebnym colorze, wyprodukowanych w 2020 roku ");
    }
    public static void ParkingInTsutsumi(){
        max = 4500;
        int countSrebnych = 0, countNiebeskich = 0, countCzarnych= 0;
        Toyota[] carInTsutsumi  = new Toyota[max];
        for (int i = 0; i < carInTsutsumi.length ; i++) {
            Randomowo();
//            System.out.print(i + 1 + " ");
//            System.out.println(model + "\t" + color + "\t" + year);
            if ("Srebny".equals(color)) {
                countSrebnych++;
            } else if ("Niebeski".equals(color)) {
                countNiebeskich++;
            } else {
                countCzarnych++;
            }
        }
        if ((countSrebnych > countNiebeskich)&&(countSrebnych > countCzarnych)){
            System.out.println("Najwięcej na parkingu w Tsutsumi znajduje się srebnych  " + countSrebnych + " aut");
        } else if((countNiebeskich > countSrebnych)&&(countNiebeskich > countCzarnych)){
            System.out.println("Najwięcej na parkingu w Tsutsumi znajduje się niebieskich  " + countNiebeskich + " aut");
        } else  if ((countCzarnych > countSrebnych)&&(countCzarnych > countNiebeskich)){
            System.out.println("Najwięcej na parkingu w Tsutsumi znajduje się czarnych  " + countCzarnych + " aut");
        } else {
            System.out.println("Coś nie gra");
        }
    }
    public static void ParkinkInTahara () {
        max = 1700;
        Toyota[] carInTahara  = new Toyota[max];
        for (int i = 0; i < carInTahara.length; i++) {
            Randomowo();
            System.out.print(i + 1 + " ");
            System.out.println(model + "\t" + color + "\t" + year);
            System.out.println("Pierwsze 10");
            for (int j = 0; j < 10 ; j++) {
                System.out.println(carInTahara[i]);
            }
        }
    }
    public static void main(String[] args) {
        //System.out.println("N " + "Model" + "\t" + "Color" + "\t" + "rok produkcji");
        ParkingInMotomachi();
        System.out.println();
        ParkingInTsutsumi();
        System.out.println();
        ParkinkInTahara();

    }
}
