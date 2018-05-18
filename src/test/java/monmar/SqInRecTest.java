package monmar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import java.util.Random;

public class SqInRecTest {

    @Test
    public void test1() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), SqInRect.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, SqInRect.sqInRect(5, 5));
    }
    @Test
    public void test3() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), SqInRect.sqInRect(3, 5));
    }
    @Test
    public void test4() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(14, 6, 6, 2, 2, 2)), SqInRect.sqInRect(20, 14));
    }
    @Test
    public void test5() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(14, 6, 6, 2, 2, 2)), SqInRect.sqInRect(14, 20));
    }
    @Test
    public void test6() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(32, 32, 32, 32, 32, 32, 32, 16, 16)), SqInRect.sqInRect(240, 32));
    }
    @Test
    public void test7() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(230, 230, 165, 65, 65, 35, 30, 5, 5, 5, 5, 5, 5)), SqInRect.sqInRect(625, 230));
    }
    @Test
    public void test8() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(230, 230, 230, 41, 41, 41, 41, 41, 25, 16, 9, 7, 2, 2, 2, 1, 1)), SqInRect.sqInRect(731, 230));
    }
    @Test
    public void test9() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(14, 14, 9, 5, 4, 1, 1, 1, 1)), SqInRect.sqInRect(37, 14));
    }
    @Test
    public void test10() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 1)), SqInRect.sqInRect(2, 1));
    }
}
