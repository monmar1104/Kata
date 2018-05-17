package monmar.lambdaEx;

import java.util.function.BiFunction;

public class Calculator {

//    interface IntegerMath {
//        int operation(int a, int b);
//    }

    public int operateBinary(int a, int b, BiFunction op) {
        return (int)op.apply(a,b);
    }

    public static void main(String... args) {

        Calculator myApp = new Calculator();
        BiFunction<Integer,Integer,Integer> addition = (a, b) -> a + b;
        BiFunction<Integer,Integer,Integer> subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
                myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
                myApp.operateBinary(20, 10, subtraction));
    }
}
