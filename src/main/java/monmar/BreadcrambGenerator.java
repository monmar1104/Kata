package monmar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BreadcrambGenerator {
    public static String generate_bc(String url, String separator) {
        String[] devidedUrl;
        if (url.contains("//")) {
            devidedUrl = url.split("//")[1].split("/");
        }
        else {
            devidedUrl = url.split("/");
        }
        int lastElement = devidedUrl.length - 1;
        String[] answerArray = new String[devidedUrl.length];
        final String[] excludedStrings = {"the", "of", "in", "from", "by", "with", "and", "or", "for", "to", "at", "a"};
        ArrayList<String> answerList = new ArrayList<>();
        if(devidedUrl.length == 1){
            return "<span class=\"active\">HOME</span>";
        }
        answerList.add("<a href=\"/\">HOME</a>");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < lastElement; i++) {
            String lengthCheck = getString(devidedUrl[i].replace('-', ' '), excludedStrings);
            stringBuilder.append(devidedUrl[i]).append("/");
            answerList.add(i, "<a href=\"/" + stringBuilder + "\">" + lengthCheck + "</a>");
        }

        if (devidedUrl[lastElement].startsWith("index") || devidedUrl[lastElement].startsWith("#") || devidedUrl[lastElement].startsWith("?")) {
            answerList.add(lastElement - 1, "<span class=\"active\">" + getString(devidedUrl[lastElement - 1].toUpperCase().replace('-',' '), excludedStrings) + "</span>");
            answerList.remove(devidedUrl.length - 1);
        } else {
            String lastElementName = devidedUrl[lastElement].split("\\.|\\?")[0].toUpperCase().replace('-', ' ');
            answerList.add("<span class=\"active\">" + getString(lastElementName,excludedStrings) + "</span>");
        }

        return answerList.size() ==1 ? "<span class=\"active\">HOME</span>"  : answerList.stream().collect(Collectors.joining(separator));

    }

    private static String getString(String s, String[] excludedStrings) {
        return s.length() > 30 ? Arrays.stream(s.split("-| "))
                        .filter(s1 -> !Arrays.stream(excludedStrings).anyMatch(s1.toLowerCase()::equals))
                        .map(s1 -> s1.split("")[0].toUpperCase())
                        .collect(Collectors.joining()) : s.toUpperCase();
    }

    public static void main(String[] args) {
        String breadcrumbs1 = generate_bc("www.agcpartners.co.uk/paper-by-diplomatic-for-insider", "+");
        System.out.println(breadcrumbs1);

    }
}
//
//        Expected : <a href="/">HOME</a> > <a href="/diplomatic-uber-kamehameha/">DIPLOMATIC UBER KAMEHAMEHA</a> > <span class="active">TEST</span>
//        Actual :   <a href="/">HOME</a> > <a href="/diplomatic-uber-kamehameha/">DIPLOMATIC-UBER-KAMEHAMEHA</a> > <span class="active">TEST</span>
//
////        Expected : <a href="/">HOME</a> + <span class="active">PDI</span>
//        Actual :   <a href="/">HOME</a> + <a href="/paper-by-diplomatic-for-insider/">PDI</a> + <span class="active"></span>


//        Expected : <a href="/">HOME</a> * <a href="/most-viewed/">MOST VIEWED</a> * <a href="/most-viewed/of-for-biotechnology/">OF FOR BIOTECHNOLOGY</a> * <span class="active">GIACOMO SORBI</span>
//        Actual :   <a href="/">HOME</a> * <a href="/most-viewed/">MOST-VIEWED</a> * <a href="/of-for-biotechnology/">OF-FOR-BIOTECHNOLOGY</a> * <span class="active">GIACOMO SORBI</span>