package monmar;

import java.util.Arrays;

public class ToSmallest {
    public static long[] smallest(long n) {
        String number = String.valueOf(n);
        String str = String.valueOf(n);
        char ch;
        long min = Long.MAX_VALUE;
        long resultj = 0;
        long resulti = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                StringBuilder s = new StringBuilder(str);
                ch = s.charAt(i);
                s.deleteCharAt(i);
                s.insert(j, ch);

                if (Long.parseLong(s.toString()) < min) {
                    min = Long.parseLong(s.toString());

                    resulti = i;
                    resultj = j;
                }
            }
        }
        return new long[] { min, resulti, resultj };
    }
}
