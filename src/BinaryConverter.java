public class BinaryConverter {
    public static void main(String[] args) {
        String binary = "1101";
        Long result = 0L;

        // 1 1 0 1 - liczba binarnie
        // 0 1 2 3 - indeks (i)
        // 3 2 1 0 - indeks odwrócony (długośc - 1 - i)

//        int i = 2;
//        char c = binary.charAt(i);
//        System.out.println(c);
//        int bit = Character.getNumericValue(c);

//        for (int i = 0; i < binary.length(); i++) {
//            char c = binary.charAt(i);
//            int bit = Character.getNumericValue(c);
//            System.out.println(bit);
//        }

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 -i;
            //System.out.println( i + " " + reversIndex);
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);
            result += bit * (int)Math.pow(2,i); //(1 * 2^0)
        }
        System.out.println(" Binarnie " + binary + " to " + result + " dsiesiętnie");

        // (1 * 2^3) + (1 * 2^2) + (0 * 2^1) + (1 * 2^0)


    }
}
