package monmar;

import org.junit.Test;

import java.util.ArrayList;

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
    String[] randDir(int n) {
        String[] dirs = new String[]{"NORTH", "SOUTH", "EAST", "WEST"};
        String[] result = new String[n];
        for (int i = 0; i < n; ++i) {
            result[i] = dirs[(int) (Math.random() * 4)];
        }
        return result;
    }
    public String[] doDirReduc(String[] arr) {
        ArrayList<String> pairs = new ArrayList();
        pairs.add("NORTHSOUTH");
        pairs.add("SOUTHNORTH");
        pairs.add("EASTWEST");
        pairs.add("WESTEAST");
        ArrayList<String> result = new ArrayList();
        for (int i = arr.length - 1; i >= 0; --i) {
            if (!result.isEmpty() && pairs.contains(arr[i] + result.get(0))) {
                result.remove(0);
            } else {
                result.add(0, arr[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    @Test
    public void testRandomDirReduc() throws Exception {
        String[] u10 = randDir(10);
        assertEquals("random 10 directions", doDirReduc(u10), DirReduction.dirReduc(u10));
        String[] u15 = randDir(15);
        assertEquals("random 15 directions", doDirReduc(u15), DirReduction.dirReduc(u15));
        String[] u30 = randDir(30);
        assertEquals("random 30 directions", doDirReduc(u30), DirReduction.dirReduc(u30));
    }
}
