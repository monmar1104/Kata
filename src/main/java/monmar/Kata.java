package monmar;

import java.util.*;
import java.util.stream.Stream;

public class Kata {
    public static char findMissingLetter(char[] array) {

        int i = 0;
        char l;
        for (l = array[i]; l <= 'z'; l++) {
            if (l == array[i]) {
                System.out.println(l);
                i++;
            } else {
                return l;
            }
        }

        return l;
    }


    public static String makeComplement(String dna) {
        //Your code
        StringBuilder newDna = new StringBuilder();
        Map<Character, Character> stringChangerMap = new HashMap<Character, Character>();
        stringChangerMap.put('A', 'T');
        stringChangerMap.put('T', 'A');
        stringChangerMap.put('C', 'G');
        stringChangerMap.put('G', 'C');

        for (int i = 0; i < dna.length(); i++) {
            if (stringChangerMap.containsKey(dna.charAt(i))) {
                newDna.append(stringChangerMap.get(dna.charAt(i)));
            } else {
                newDna.append(dna.charAt(0));
            }
        }
        return newDna.toString();
    }


    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'f'};

        System.out.println("Missing letter: " + findMissingLetter(array));
    }

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        double result = principal;
        double profit;
        int numberOfYears = 0;
        while (desired > result) {
            profit = result * interest * (1 - tax);
            result = result + profit;
            numberOfYears++;
        }
        return numberOfYears;
    }

    public static int findShort(String s) {

        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();

//        String[] strings = s.split(" ");
//        int lenghtOfString = strings[0].length();
//        for (String s1 : strings) {
//            if (s1.length() < lenghtOfString) {
//                lenghtOfString=s1.length();
//            }
//        }
//        return lenghtOfString;
    }

    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') {
                countX++;
            } else if (str.toLowerCase().charAt(i) == 'o') {
                countO++;
            }
        }
        return countO == countX;
    }

    public static String longest(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));

//        for(Character letter='a';letter<='z';letter++){
//            if(s1.contains(letter.toString()) || s2.contains(letter.toString())){
//                sb.append(letter);
//            }
//        }
        return sb.toString();
    }


    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!(""+i).contains("5")) {
                count++;
            }
        }
        return count;
    }

}
