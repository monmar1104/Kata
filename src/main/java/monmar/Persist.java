package monmar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Persist {

        public static int persistence(long n) {
            if (n < 10) return 0;

            final long newN = Arrays.stream(String.valueOf(n).split(""))
                    .mapToLong(Long::valueOf)
                    .reduce(1, (acc, next) -> acc * next);

            return persistence(newN) + 1;
//
//
//            int result = 0;
//            while (n > 9) {
//                long multi = 1;
//                for (char t : String.valueOf(n).toCharArray()) {
//                    multi *= Long.parseLong(String.valueOf(t));
//                }
//                n = multi;
//                result++;
//            }
//            return result;
        }
}
