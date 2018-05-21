package monmar;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Bowling {


    public static int bowling_score(String frames) {
        String[] fArr = frames.split(" ");
        int score = 0;

        for (int i = 0 ; i < fArr.length ; i++) {
            if (fArr[i].matches("X|[0-9]/")) {
                if (i < 9) fArr[i] = Arrays.stream(fArr, i, fArr.length)
                        .collect(Collectors.joining(""))
                        .substring(0, 3);
            }
            score += fArr[i].replaceAll("[0-9]/","X")
                    .chars()
                    .map( n -> !Character.isDigit((char) n) ? 10 : Integer.valueOf(Character.toString((char) n)))
                    .sum();
        }
        return score;
    }
//    public static int bowling_score(String frames) {
//        String[] arrayOfFrames = frames.split(" ");
//
//        int[] scores = new int[arrayOfFrames.length];
//        for (int i = 0; i < arrayOfFrames.length; i++) {
//            int score = 0;
//            if (arrayOfFrames[i].equals("XXX")) {
//                scores[i] = 30;
//            } else if (arrayOfFrames[i].contains("/") && !arrayOfFrames[i].contains("X")) {
//                if (i==9){
//                 scores[i] = 10 + Integer.valueOf(arrayOfFrames[i].split("")[2]);
//                }
//                else {
//                    scores[i] = 10 + (arrayOfFrames[i + 1].contains("X") ? 10 : getFirstThrow(arrayOfFrames[i + 1]));
//                }
//            } else if (i <= 7 && arrayOfFrames[i].equals("X")) {
//                score += 10;
//                if (arrayOfFrames[i + 1].contains("X")) {
//                    score += 10;
//                    scores[i] = score + (arrayOfFrames[i + 2].contains("X") ? 10 : getFirstThrow(arrayOfFrames[i + 2]));
//                }
//                else if (arrayOfFrames[i + 1].contains("/")) {
//                    scores[i] = score + 10;
//                }
//                else {
//                    scores[i] = score + getDigitsFromString(arrayOfFrames[i + 1]);
//                }
//            } else if (i == 8 && arrayOfFrames[i].equals("X")) {
//                score += 10;
//                if (arrayOfFrames[i + 1].contains("XX")) {
//                    scores[i] = score + 20;
//                } else if (arrayOfFrames[i + 1].contains("/") && !arrayOfFrames[i + 1].contains("X")) {
//                    scores[i] = score + 10;
//                } else if (arrayOfFrames[i + 1].contains("/") && arrayOfFrames[i + 1].contains("X")) {
//                    scores[i] = score + 10 + Integer.valueOf(arrayOfFrames[i + 1].split("")[1]) ;
//                } else if (arrayOfFrames[i + 1].contains("X") && !arrayOfFrames[i + 1].contains("/")) {
//                    scores[i] = score + 10 + Integer.valueOf(arrayOfFrames[i + 1].split("")[1]);
//                } else {
//                    scores[i] = score + getDigitsFromString(arrayOfFrames[i + 1]);
//                }
//            } else if (i == 9 && arrayOfFrames[i].contains("X")) {
//                score += 10;
//                if (arrayOfFrames[i].contains("/")) {
//                    scores[i] = score + 10;
//                }
//                else if (arrayOfFrames[i].contains("XX")) {
//                    scores[i] = score + 10 + Integer.valueOf(arrayOfFrames[i].split("")[2]);
//                }
//                else {
//                    scores[i] = score + Integer.valueOf(arrayOfFrames[i].split("")[1]) + Integer.valueOf(arrayOfFrames[i].split("")[2]);
//                }
//            } else {
//                scores[i] = getDigitsFromString(arrayOfFrames[i]);
//            }
//
//        }
//
//
//        return Arrays.stream(scores).sum();
//    }
//
//    private static int getFirstThrow(String frame) {
//        return Integer.valueOf(frame.split("")[0]);
//    }
//
//    private static int getSecondThrow(String frame) {
//        return Integer.valueOf(frame.split("")[1]);
//    }
//
//    public static int getDigitsFromString(String number) {
//        int firstThrow = Integer.valueOf(number.split("")[0]);
//        int secondThrow = Integer.valueOf(number.split("")[1]);
//
//        return firstThrow + secondThrow;
//    }
}
