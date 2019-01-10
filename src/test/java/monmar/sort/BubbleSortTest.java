package monmar.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    @Test
    public void bubbleSortTest() {

        int[] array = {5, 3, 4, 8, 2};

        String a = Arrays.toString(new int[]{2, 3, 4, 5, 8});

        BubbleSort.sort(array);

        assertEquals(a, Arrays.toString(array) );

    }
}
