public class Lab81 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 2, 3, 4, 4, 2, 2, 4, 2, 3};
        int[] counters = new int[10]; // od 0 do 9

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
            // int digit = arr[i]
            // counters[digit] = counters[digit] + 1
            // counters[arr[i]]++
        }
        for (int stat : counters) {
            System.out.print(stat + " ");
        }
        int mostFrequent = 0;
        for (int i = 0; i < counters.length ; i++) {
            if (counters[i] > counters[mostFrequent]){
                mostFrequent = i;
            }
        }
        System.out.print("\nNajczęściej występującą cyfrą w tablice jest cyfra " + mostFrequent);
        System.out.println(" , wystąpila " + counters[mostFrequent] + " razy ");
    }
}
