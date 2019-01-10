package monmar.sort;

public class BubbleSort {

    public static int[] sort(int[] array) {
        int n = array.length;
        int temp;
        while (n>0) {
            for (int i = 0; i < n-1; i++) {
                if(array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            n--;
        }
        return array;
    }

}
