package monmar;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {


    public static List<Integer> sqInRect(int min, int max) {
        if (max == min) {
            return null;
        }
        List<Integer> sqInRect = new ArrayList<>();
        for (; max > 0 && min > 0; max -= min) {
            if (min > max) {
                int foo = max;
                max = min;
                min = foo;
            }
            sqInRect.add(min);
        }
        return sqInRect;
    }

//    public static List<Integer> sqInRect(int i, int i1) {
//        List<Integer> integers = new ArrayList<>();
//        if (i ==i1) {
//            integers = null;
//            return integers;
//        }
//
//        int num = Integer.min(i, i1);
//        while (num>0){
//            integers.add(num);
//            i1 = i-i1;
//            i = num;
//            num = Integer.min(i, i1);
//        }
//        return integers;
//    }
}
