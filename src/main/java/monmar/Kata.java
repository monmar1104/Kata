package monmar;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
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
            if (!("" + i).contains("5")) {
                count++;
            }
        }
        return count;
    }

    public static int getCount(String str) {

        return str.replaceAll("(?i)[^aeiou]", "").length();
//        int vowelsCount = str.length();
//        String[] chars = {"a", "e", "i", "o", "u"};
//        for (String c : chars) {
//            str = str.replace(c, "");
//        }
//        return vowelsCount-str.length();
    }

    public static int digital_root(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

    public static String createPhoneNumber(int[] numbers) {
//        StringBuilder sb = new StringBuilder();
//            return sb.append("(").append(numbers[0]).append(numbers[1]).append(numbers[2]).append(")")
//                    .append(" ")
//                    .append(numbers[3])
//                    .append(numbers[4])
//                    .append(numbers[5])
//                    .append("-")
//                    .append(numbers[6])
//                    .append(numbers[7])
//                    .append(numbers[8])
//                    .append(numbers[9]).toString();

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);

        }

    public String toJadenCase(String phrase) {

        if (null == phrase || phrase.length() == 0) {
            return null;
        }
        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }

    public static long digPow(int n, int p) {
        String intString = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < intString.length(); ++i, ++p)
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        return (sum % n == 0) ? sum / n : -1;
    }

    public static int duplicateCount(String text) {

        Map<Character,Integer> duplicateMap = new HashMap<>();
        for (int i=0;i<text.length();i++){
            duplicateMap.put(text.charAt(i),duplicateMap.containsKey(text.charAt(i)) ? duplicateMap.get(text.charAt(i))+1 : 1);
        }
        return (int) duplicateMap.values().stream().filter(c -> c > 1).count();
    }

    public static String changeWeightInRighOrder(String s) {

        List<String> list = Stream.of(s.split(" ")).collect(Collectors.toList());
        Map<String,Integer> weightMap = new TreeMap<>();
        int sum=0;
        for (int i=0;i<list.size();i++){
//            weightMap.putIfAbsent(list.get(i),list.get(i).chars().sum());
            char[] chars = list.get(i).toCharArray();
            for (int k=0;k<chars.length;k++){
                sum+=Character.getNumericValue(chars[k]);
            }
            weightMap.putIfAbsent(list.get(i),sum);
        }
//        return weightMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).collect(Collectors.toList());
        return "sd";
    }

    public static String[] inArray(String[] array1, String[] array2) {

//        Arrays.stream(array1).

        return new String[] { "arp" };
    }

    public static boolean scramble(String str1, String str2) {
        char[] str2Array = str2.toCharArray();
        List<Character> chars = str1.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        int i =0;
        for (Character c : str2Array) {
            if (chars.contains(c)) {
                i++;
                chars.remove(c);
            }
        }
        return i==str2.length() ? true : false;
    }
}
