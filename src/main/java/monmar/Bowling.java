package monmar;

import java.util.Arrays;

public class Bowling {
    public static int bowling_score(String frames) {
        String[] arrayOfFrames = frames.split(" ");

        int[] scores = new int[arrayOfFrames.length];
        for (int i = 0; i < arrayOfFrames.length; i++) {
            int score = 0;
            if (arrayOfFrames[i].equals("XXX")) {
                scores[i] = 30;
            }
            else if (arrayOfFrames[i].contains("/")) {
                scores[i] = 10 + (arrayOfFrames[i + 1].equals("X") ? 10 : getFirstThrow(arrayOfFrames[i + 1]));

            }
            else if (arrayOfFrames[i].equals("X")) {
                score+=10;
                if (i<=7 && arrayOfFrames[i + 1].contains("X") ||arrayOfFrames[i + 1].contains("/") ) {
                    score+=10;
                    if (arrayOfFrames[i + 1].contains("X"))
                    scores[i]=score + (arrayOfFrames[i + 2].contains("X") ? 10 : getFirstThrow(arrayOfFrames[i + 2]));
                }
                else if (i>7 && arrayOfFrames[i + 1].contains("X") || arrayOfFrames[i + 1].contains("/")) { scores[i]=30;}
            } else {
                scores[i] = score + getDigitsFromString(arrayOfFrames[i]);
            }

        }


        return Arrays.stream(scores).sum();
    }

    private static int getFirstThrow(String frame) {
        return Integer.valueOf(frame.split("")[0]);
    }

    private static int getSecondThrow(String frame) {
        return Integer.valueOf(frame.split("")[1]);
    }

    public static int getDigitsFromString(String number) {
        int firstThrow = Integer.valueOf(number.split("")[0]);
        int secondThrow = Integer.valueOf(number.split("")[1]);

        return firstThrow + secondThrow;
    }
}
