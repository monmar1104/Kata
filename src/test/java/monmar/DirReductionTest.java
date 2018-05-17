package monmar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DirReductionTest {
    @Test
    public void testSimpleDirReduc() throws Exception {
        assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

        assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
                new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));


    assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\"",
                         new String[]{"NORTH", "WEST"},
            DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST", "WEST", "NORTH"}));
}
}
