package monmar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;


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
}
