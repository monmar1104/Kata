package monmar.sort;

public class QuickSort {
    public static void sort(int[] array, int left, int right) {

        if(left < right) {
            int m = left;
            for (int i = left+1; i <= right; i++){
                if(array[i] < array[left]) {
                    changeValue(array, ++m, i);
                }
            }
            changeValue(array, left, m);
            sort(array, left, m-1);
            sort(array, m+1,right);
        }
    }

    static void changeValue(int[] array, int a, int b ) {

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
