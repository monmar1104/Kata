package monmar.lambdaEx.interfacef;

import java.util.function.BiConsumer;

public class FuncionalInterfaceUsage {

    public static void main(String[] args) {

        calculate(8, 5, "+");
        calculate(8, 5, "-");
        calculate(8, 5, "*");
        calculate(8, 5, "/");


    }



    static void calculate(double a, double b, String operator) {

        BiConsumer<Double, Double> biConsumer = null;

        switch (operator) {
            case "+" : biConsumer = (x, y) -> System.out.println("Wynik: " + a + " " + operator + " " + b + " = " + (x + y));
            break;
            case "-" : biConsumer = (x, y) -> System.out.println("Wynik: " + a + " " + operator + " " + b + " = " + (x - y));
            break;
            case "*" : biConsumer = (x, y) -> System.out.println("Wynik: " + a + " " + operator + " " + b + " = " + (x * y));
            break;
            case "/" : biConsumer = (x, y) -> System.out.println("Wynik: " + a + " " + operator + " " + b + " = " + (x / y));
            break;
        }
        biConsumer.accept(a, b);
    }


}
