package monmar;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Bowling {


    public static int bowling_score(String frames) {
        String[] fArr = frames.split(" ");
        int score = 0;

        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i].matches("X|[0-9]/")) {
                if (i < 9) fArr[i] = Arrays.stream(fArr, i, fArr.length)
                        .collect(Collectors.joining(""))
                        .substring(0, 3);
            }
            score += fArr[i].replaceAll("[0-9]/", "X")
                    .chars()
                    .map(n -> !Character.isDigit((char) n) ? 10 : Integer.valueOf(Character.toString((char) n)))
                    .sum();
        }
        return score;
    }
}
