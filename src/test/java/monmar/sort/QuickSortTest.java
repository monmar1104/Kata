package monmar.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void quickSortTest() {

        int[] array = {5, 3, 4, 8, 2};

        String a = Arrays.toString(new int[]{2, 3, 4, 5, 8});

        QuickSort.sort(array, 0, array.length-1);

        assertEquals(a, Arrays.toString(array) );

    }
}
