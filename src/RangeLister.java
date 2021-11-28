public class RangeLister {

    public static void main(String[] args) {
        RangeLister rl = new RangeLister();
        int[] range = rl.makeRange(2,5);
        rl.showRange(range);
            }
    int[] makeRange(int lower, int upper) {
        int[] range = new int[(upper - lower) + 1]; //od 2 do 5 to = 4 elementy( 2,3,4,5)
            for (int i = 0; i < range.length; i++) {
            range[i] = lower ++; // Uwaga na post ikrementacje
        }
        return range;
    }
       void showRange(int[] range) {
           System.out.print("Tablica: [ ");
           for (int i = 0; i < range.length; i++) {
               System.out.print(range[i] + " ");
           }
           System.out.println("]");
       }
}
