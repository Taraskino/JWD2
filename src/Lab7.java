public class Lab7 {
    public static void main(String[] args) {

        char num = '2';
        switch (num) {
            case 2:
                for (int i = 1; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(i + j + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(i + j + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(i + j + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}