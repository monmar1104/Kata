package monmar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StreetFighterTest {
    String[][] fighters = new String[][]{
            new String[] {       "",    "Ryu",  "E.Honda",  "Blanka",   "Guile", ""      },
            new String[] { "Balrog",    "Ken",  "Chun Li", "Zangief", "Dhalsim", "Sagat" },
            new String[] {   "Vega", "T.Hawk", "Fei Long",  "Deejay",   "Cammy", "M.Bison"      },
    };

    @Test
    public void shouldWorkWithNoMoves() {
        String[] solution = new String[]{};
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, new int[]{0,1}, new String[]{}));
    }

    @Test
    public void shouldWorkWithFewMoves(){
        String[] moves = new String[] { "up", "left", "right", "left", "left" };
        int[] position = new int[] {1,1};
        String[] solution = new String[] { "Ryu", "Guile", "Ryu", "Guile", "Blanka" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldStopOnEmptySpacesVertically(){
        String[] moves = new String[] { "up" };
        int[] position = new int[] {1,0};
        String[] solution = new String[] { "Balrog" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldStopOnEmptySpacesVertically2(){
        String[] moves = new String[] { "up", "up", "up", "up" };
        int[] position = new int[] {1,0};
        String[] solution = new String[] { "Balrog", "Balrog", "Balrog", "Balrog" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldStopVertically(){
        String[] moves = new String[] { "down", "down", "down", "down" };
        int[] position = new int[] {1,0};
        String[] solution = new String[] { "Vega", "Vega", "Vega", "Vega" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldStopOnEmptySpacesVertically3(){
        String[] moves = new String[] { "up", "up", "up", "up" };
        int[] position = new int[] {1,5};
        String[] solution = new String[] { "Sagat", "Sagat", "Sagat", "Sagat" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldStopVertically4(){
        String[] moves = new String[] { "down", "down", "down", "down" };
        int[] position = new int[] {1,5};
        String[] solution = new String[] { "M.Bison", "M.Bison", "M.Bison", "M.Bison" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldRotateHorizontallyWithEmptySpaces(){
        String[] moves = new String[] { "right", "right", "right", "right", "right", "right", "right", "right" };
        int[] position = new int[] {0,2};
        String[] solution = new String[] { "Blanka", "Guile", "Ryu", "E.Honda", "Blanka", "Guile", "Ryu", "E.Honda" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldRotateHorizontally(){
        String[] moves = new String[] { "left", "left", "left", "left", "left", "left", "left", "left" };
        int[] position = new int[] {1,3};
        String[] solution = new String[] { "Chun Li", "Ken", "Balrog", "Sagat", "Dhalsim", "Zangief", "Chun Li", "Ken" };
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    @Test
    public void shouldRotateOnAllRows(){
        String[] moves = new String[] { "right", "right", "right", "right", "right", "right", "down", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "down", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right" };
        int[] position = new int[] {0,2};
        String[] solution = new String[] {"Blanka", "Guile", "Ryu", "E.Honda", "Blanka", "Guile", "Dhalsim", "Zangief", "Chun Li", "Ken", "Balrog", "Sagat", "Dhalsim", "Zangief", "Chun Li", "Ken", "Balrog", "Sagat", "Dhalsim", "Cammy", "M.Bison", "Vega", "T.Hawk", "Fei Long", "Deejay", "Cammy", "M.Bison", "Vega", "T.Hawk", "Fei Long", "Deejay", "Cammy"};
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters, position, moves));
    }

    // DO NOT CHANGE THIS VARIABLE!
    // LIST WITH HOLES AND DUPLICATES
    String[][] fighters3 = new String[][]{
            new String[] {      "",    "Ryu",  "E.Honda",  "Cammy",  "Blanka",   "Guile",        "", "Chun Li" },
            new String[] {"Balrog",    "Ken",  "Chun Li",       "", "M.Bison", "Zangief", "Dhalsim", "Sagat"},
            new String[] {  "Vega",       "", "Fei Long", "Balrog",  "Deejay",   "Cammy",        "", "T.Hawk" },
    };

    @Test
    public void shouldRotateOnAllRows3(){
        String[] moves = new String[] { "right", "right", "right", "right", "right", "right", "down", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "left", "down", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right" };
        int[] position = new int[] {0,2};
        String[] solution = new String[] {"Cammy", "Blanka", "Guile", "Chun Li", "Ryu", "E.Honda", "Chun Li", "Ken", "Balrog", "Sagat", "Dhalsim", "Zangief", "M.Bison", "Chun Li", "Ken", "Balrog", "Sagat", "Dhalsim", "Zangief", "Cammy", "T.Hawk", "Vega", "Fei Long", "Balrog", "Deejay", "Cammy", "T.Hawk", "Vega", "Fei Long", "Balrog", "Deejay", "Cammy"};
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters3, position, moves));
    }

    @Test
    public void shouldJustWork3(){
        String[] moves = new String[] {"down", "right", "right", "right", "down", "left", "left", "down", "right", "right", "right", "up" };
        int[] position = new int[] {0,3};
        String[] solution = new String[] {"Cammy", "Blanka", "Guile", "Chun Li", "Sagat", "Dhalsim", "Zangief", "Cammy", "T.Hawk", "Vega", "Fei Long", "Chun Li"};
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters3, position, moves));
    }

    String[][] fighters4 = new String[][]{
            new String[] {      "",     "Ryu",  "E.Honda",  "Cammy" },
            new String[] {"Balrog",     "Ken",  "Chun Li",       "" },
            new String[] {  "Vega",        "", "Fei Long", "Balrog" },
            new String[] {"Blanka",   "Guile",         "", "Chun Li"},
            new String[] {"M.Bison","Zangief",  "Dhalsim", "Sagat"  },
            new String[] {"Deejay",   "Cammy",         "", "T.Hawk" }
    };

    @Test
    public void shouldWorkWithLongerGrid4(){
        String[] moves = new String[] {"left", "left", "down", "right", "right", "right", "right", "down", "left", "left", "left", "left", "down", "right", "right", "down", "right", "right", "right", "down", "left", "left", "left", "down", "left", "left", "left"};
        int[] position = new int[] {0,3};
        String[] solution = new String[] {"E.Honda", "Ryu", "Ken", "Chun Li", "Balrog", "Ken", "Chun Li", "Fei Long", "Vega", "Balrog", "Fei Long", "Vega", "Blanka", "Guile", "Chun Li", "Sagat", "M.Bison", "Zangief", "Dhalsim", "Dhalsim", "Zangief", "M.Bison", "Sagat", "T.Hawk", "Cammy", "Deejay", "T.Hawk"};
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters4, position, moves));
    }

    @Test
    public void shouldWorkWithOddInitialPosition(){
        String[] moves = new String[] {"left", "left", "down", "right", "right", "right", "right", "down", "left", "left", "left", "left", "up", "right", "right", "up", "right", "right", "right"};
        int[] position = new int[] {3,3};
        String[] solution = new String[] {"Guile", "Blanka", "M.Bison", "Zangief", "Dhalsim", "Sagat", "M.Bison", "Deejay", "T.Hawk", "Cammy", "Deejay", "T.Hawk", "Sagat", "M.Bison", "Zangief", "Guile", "Chun Li", "Blanka", "Guile"};
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters4, position, moves));
    }


    String[][] fighters5 = new String[][]{
            new String[] {      "",     "Ryu",  "E.Honda",  "Cammy" },
            new String[] {"Balrog",     "Ken",  "Chun Li",       "" },
            new String[] {  "Vega",        "", "Fei Long", "Balrog" },
            new String[] {"Blanka",   "Guile",         "", "Chun Li"},
            new String[] {"M.Bison","Zangief",  "Dhalsim", "Sagat"  },
            new String[] {"Deejay",   "Cammy",         "", "" }
    };

    @Test
    public void shouldWorkWithLongerGrid5(){
        String[] moves = new String[] {"right","right", "right", "right", "up", "up", "up"};
        int[] position = new int[] {5,1};
        String[] solution = new String[] {"Deejay",   "Cammy","Deejay",   "Cammy", "Zangief", "Guile", "Guile"};
        assertEquals(solution, StreetFighter.superStreetFighterize(fighters5, position, moves));
    }

    public static String[] mysuperStreetFighterize(String[][] fighters, int[] position, String[] moves) {
        int ud = position[0];
        int lr = position[1];
        List<String> finalList = new ArrayList<String>();
        for(int i = 0; i < moves.length; i++){
            switch(moves[i]){
                case "up":
                    if((ud>0) && (!fighters[ud-1][lr].equals("")))
                        ud -= 1;
                    break;
                case "down":
                    if((ud<fighters.length-1) && (!fighters[ud+1][lr].equals("")))
                        ud += 1;
                    break;
                case "left":
                    while(true){
                        lr = (lr + fighters[ud].length - 1) % fighters[ud].length;
                        if(!fighters[ud][lr].equals("")){
                            break;
                        }
                    };
                    break;
                case "right":
                    while(true){
                        lr = (lr + fighters[ud].length + 1) % fighters[ud].length;
                        if(!fighters[ud][lr].equals("")){
                            break;
                        }
                    };
                    break;
            }
            finalList.add(fighters[ud][lr]);
        }
        return finalList.toArray(new String[0]);
    }


    String[][] fighters6 = new String[][]{
            new String[] {      "",     "Ryu",  "E.Honda",  "Cammy" },
            new String[] {"Balrog",     "Ken",  "Chun Li",       "" },
            new String[] {  "Vega",        "", "Fei Long", "Balrog" },
            new String[] {"Blanka",   "Guile",         "", "Chun Li"},
            new String[] {"M.Bison","Zangief",  "Dhalsim", "Sagat"  },
            new String[] {"Deejay",   "Cammy",         "", "T.Hawk" }
    };

    @Test
    public void shouldWorkWithRandomValues(){
        Random rand = new Random();
        String[] opts = new String[] { "up", "down", "left", "right" };
        for(int i=0;i<30;i++){
            int num_moves = rand.nextInt(30) + 10;
            String[] moves = new String[num_moves];
            for(int j=0;j<num_moves;j++){
                moves[j] = opts[rand.nextInt(opts.length)];
                //System.out.println(moves[j]);
            }
            int[] position;
            while(true){
                position = new int[]{rand.nextInt(fighters6.length-1),rand.nextInt(fighters6[0].length-1)};
                if(!(fighters6[position[0]][position[1]]).equals("")){
                    break;}
            }
            String[] solution = StreetFighterTest.mysuperStreetFighterize(fighters6, position, moves);
            assertEquals(solution,  StreetFighter.superStreetFighterize(fighters6, position, moves));
        }
    }

}
