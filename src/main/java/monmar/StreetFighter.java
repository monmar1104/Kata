package monmar;

import java.util.*;

public class StreetFighter {
    public static String[] superStreetFighterize(String[][] fighters, int[] position, String[] moves) {
        String[] selectedFighters = new String[moves.length];
        int vertical = position[0];
        int horizontal = position[1];
        for (int i = 0; i < moves.length; i++) {
            if (moves[i].equals("up")) {
                if (vertical == 0) {
                    if (!fighters[fighters.length-1][horizontal].equals("")) {
                        vertical = fighters.length-1;
                    }

                } else if (!fighters[vertical - 1][horizontal].equals("")) {
                    vertical -= 1;
                }
                selectedFighters[i] = fighters[vertical][horizontal];
            }

            if (moves[i].equals("down")) {
                if (vertical == fighters.length - 1) {
                    if (!fighters[0][horizontal].equals("")) {
                        vertical = 0;
                    }

                } else if (!fighters[vertical + 1][horizontal].equals("")) {
                    vertical += 1;
                }
                selectedFighters[i] = fighters[vertical][horizontal];
            }


            if (moves[i].equals("left")) {
                if (horizontal == 0) {
                    horizontal = fighters[vertical].length - 1;
                } else {
                    horizontal -= 1;
                }
                while (fighters[vertical][horizontal].equals("")) {
                    if (horizontal == 0) {
                        horizontal = fighters[vertical].length - 1;
                    } else {
                        horizontal -= 1;
                    }
                }
                selectedFighters[i] = fighters[vertical][horizontal];
            }

            if (moves[i].equals("right")) {
                if (horizontal == fighters[vertical].length - 1) {
                    horizontal = 0;
                } else {
                    horizontal += 1;
                }
                while (fighters[vertical][horizontal].equals("")) {
                    if (horizontal == fighters[vertical].length - 1) {
                        horizontal = 0;
                    } else {
                        horizontal += 1;
                    }
                }
                selectedFighters[i] = fighters[vertical][horizontal];
            }
        }


        return selectedFighters;
    }
}
