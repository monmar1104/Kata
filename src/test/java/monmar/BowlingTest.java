package monmar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

//Ten-Pin Bowling

public class BowlingTest {

    @Test
    public void BasicTests() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(20, Bowling.bowling_score("11 11 11 11 11 11 11 11 11 11"));

        System.out.println("Woah! Perfect game!");
        assertEquals(300, Bowling.bowling_score("X X X X X X X X X XXX"));
    }

    @Test
    public void BasicTests1() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(117, Bowling.bowling_score("X 9/ 11 23 X X X 11 X 11"));
    }


    @Test
    public void BasicTests2() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(136, Bowling.bowling_score("X 9/ 11 23 X X X 11 X X11"));
    }

    @Test
    public void BasicTests3() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(152, Bowling.bowling_score("X 9/ 11 23 X X X 11 X X9/"));
    }

    @Test
    public void BasicTests4() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(143, Bowling.bowling_score("X 9/ 11 23 X X X 11 6/ X9/"));
    }

    @Test
    public void BasicTests5() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(141, Bowling.bowling_score("X 9/ X 23 X X X 11 6/ 22"));
    }
    @Test
    public void BasicTests6() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(171, Bowling.bowling_score("X X 9/ 80 X X 90 8/ 7/ 44"));
    }

    @Test
    public void BasicTests7() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(194, Bowling.bowling_score("X X 9/ 80 X X 90 8/ 7/ XX5"));
    }

    @Test
    public void BasicTests8() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(177, Bowling.bowling_score("X X 9/ 80 X X 90 8/ 7/ 4/4"));
    }

    @Test
    public void BasicTests9() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(140, Bowling.bowling_score("22 X 9/ X 11 X 90 8/ X 4/4"));
    }

    @Test
    public void BasicTests10() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(160, Bowling.bowling_score("22 X 9/ X 11 X 90 8/ X XX4"));
    }

    @Test
    public void BasicTests11() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(151, Bowling.bowling_score("22 X 9/ X 11 X 90 8/ X X5/"));
    }

    @Test
    public void BasicTests12() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(114, Bowling.bowling_score("22 X 9/ X 11 X 90 8/ 22 2/2"));
    }

    @Test
    public void BasicTests13() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(130, Bowling.bowling_score("22 X 9/ X 11 X 90 X 5/ 2/2"));
    }

    @Test
    public void BasicTests14() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(150, Bowling.bowling_score("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5"));
    }

    @Test
    public void BasicTests15() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(133, Bowling.bowling_score("63 52 8/ 06 X X 3/ 7/ 8/ 53"));
    }
}
