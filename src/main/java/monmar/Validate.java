package monmar;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class Validate {


    public static boolean validate(String n){
        AtomicBoolean doubleValue = new AtomicBoolean(n.length() % 2 == 0);
        int sum = n.chars()
                .map(x -> {
                    int y = x - '0';
                    int z = doubleValue.getAndSet(!doubleValue.get()) ? ((y * 2) > 9 ? (y * 2) - 9 : (y * 2)) : y;
                    return z;
                })
                .sum();
        return sum % 10 == 0;

    }

//    public static boolean validate(String n){
//        int sum=0;
//        int k=1;
//        for (int i=n.length()-1; i>=0; i--) {
//            int d = (n.charAt(i)-'0') * k;
//            k = 3-k;
//            if (d>9) d-=9;
//            sum+=d;
//        }
//        return sum % 10 == 0;
//    }



//    public static boolean validate(String n) {
//        final boolean[] flag = {(n.length() & 1) == 1};
//        return Arrays.stream(
//                n.split(""))
//                .map(Integer::parseInt)
//                .mapToInt(value -> value)
//                .map(integer -> ((flag[0] ^= true) ? (integer * 2 - 1) % 9 + 1 : integer))
//                .sum() % 10 == 0;
//    }
//    public static boolean validate(String n){
//        int[] ints = new int[n.length()];
//        int digits = Integer.parseInt(n);
//        int digitFromString;
//        for (int i=0; i<n.length();i++){
//            if(digits%2==0){
//                if(i%2==0){
//                    digitFromString = Integer.parseInt(String.valueOf(n.charAt(i)))*2;
//                }
//                else {
//                    digitFromString = Integer.parseInt(String.valueOf(n.charAt(i)));
//                }
//            }
//            else if(i%2==0){
//                digitFromString = Integer.parseInt(String.valueOf(n.charAt(i)));
//            }
//            else {
//                digitFromString = Integer.parseInt(String.valueOf(n.charAt(i)))*2;
//            }
//
//            if(digitFromString>9){
//
//                ints[i] = digitFromString-9;
//
//            } else{
//                ints[i] = digitFromString;
//            }
//        }
//        int sum = 0;
//        for (int i : ints){
//            sum+=i;
//        }
//        int sum1 = sum%10;
//        return sum1==0;
//    }
}
