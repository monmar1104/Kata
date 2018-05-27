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

//    public static String[] superStreetFighterize(String[][] f, int[] pos, String[] moves){
//        String[] res=new String[moves.length];
//        int i=0;
//        for (String s:moves){
//            pos[0]= s=="up"&&pos[0]!=0? pos[0]-1:pos[0];
//            pos[0]= f[pos[0]][pos[1]]==""? pos[0]+1: pos[0];
//
//            pos[0]= s=="down"&&pos[0]!=f.length-1? pos[0]+1:pos[0];
//            pos[0]= f[pos[0]][pos[1]]==""? pos[0]-1: pos[0];
//
//            do{
//                pos[1]= s=="left"&&pos[1]!=0 ? pos[1]-1: s=="left"&&pos[1]==0 ? f[pos[0]].length-1: pos[1];
//                pos[1]= s=="right"&&pos[1]<f[pos[0]].length-1 ? pos[1]+1: s=="right"&&pos[1]==f[pos[0]].length-1 ? 0: pos[1];
//            }while(f[pos[0]][pos[1]]=="");
//
//            res[i]=f[pos[0]][pos[1]];
//            i++;
//        }
//        return res;
//    }


//    public static String[] superStreetFighterize(String[][] fighters, int[] position, String[] moves)
//    {
//        String[] selections = new String[moves.length];
//        int row = position[0], col = position[1];
//        for (int i = 0; i < moves.length; i++)
//        {
//            do
//            {
//                switch ( moves[i] )
//                {
//                    case "up":
//                        if ( --row < 0 || "" == fighters[row][col] ) row++;
//                        break;
//                    case "down":
//                        if ( fighters.length <= ++row || "" == fighters[row][col] ) row--;
//                        break;
//                    case "left":
//                        if ( --col < 0 ) col = fighters[0].length-1;
//                        break;
//                    case "right":
//                        if ( fighters[0].length <= ++col ) col = 0;
//                        break;
//                }
//            }
//            while ( "" == fighters[row][col] );
//            selections[i] = fighters[row][col];
//        }
//        return selections;
//    }

}
