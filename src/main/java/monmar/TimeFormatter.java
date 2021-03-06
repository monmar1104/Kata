package monmar;


import java.util.Arrays;
import java.util.stream.*;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        return seconds == 0 ? "now" :
                Arrays.stream(
                        new String[]{
                                formatTime("year",  (seconds / 31536000)),
                                formatTime("day",   (seconds / 86400)%365),
                                formatTime("hour",  (seconds / 3600)%24),
                                formatTime("minute",(seconds / 60)%60),
                                formatTime("second",(seconds%3600)%60)})
                        .filter(e->e!="")
                        .collect(Collectors.joining(", "))
                        .replaceAll(", (?!.+,)", " and ");
    }
    public static String formatTime(String s, int time){
        return time==0 ? "" : Integer.toString(time)+ " " + s + (time==1?"" : "s");
    }
}


//
//
//    public static String formatDuration(int seconds) {
//        final int year = 31536000;
//        final int day = 86400;
//        final int hour = 3600;
//        final int minute = 60;
//
//        int numberOfYears = seconds / year;
//        int numberOfDays = seconds >= year ? (seconds - (numberOfYears * year)) / day : seconds / day;
//        int numberOfHours = seconds >= day ? (seconds - (numberOfYears * year) - (numberOfDays * day)) / hour : seconds / hour;
//        int numberOfMinutes = seconds >= minute ? (seconds - (numberOfYears * year) - (numberOfDays * day) - (numberOfHours * hour)) / minute : seconds / minute;
//        int numberOfSeconds = seconds >= 1 ? (seconds - (numberOfYears * year) - (numberOfDays * day) - (numberOfHours * hour) - (numberOfMinutes * minute)) : seconds;
//
//        StringBuilder sb = new StringBuilder();
//
//        if (seconds == 0) {
//            return "now";
//        }
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add(getYear(numberOfYears));
//        stringList.add(getDay(numberOfDays));
//        stringList.add(getHour(numberOfHours));
//        stringList.add(getMinute(numberOfMinutes));
//        stringList.add(getSecond(numberOfSeconds));
//
//        List<String> dateWithoutEmpty = stringList.stream().filter(d -> !d.equals("")).collect(Collectors.toList());
//        List<String> returnList = new ArrayList<>(dateWithoutEmpty);
//        for (int i = 0; i < dateWithoutEmpty.size()-1; i++) {
//            if (i < dateWithoutEmpty.size()-2) {
//                returnList.add(i+i + 1, ", ");
//            } else if(dateWithoutEmpty.size() > 1) {
//                returnList.add(returnList.size()-1, " and ");
//            }
//        }
//
//        return returnList.stream().reduce("", String::concat);
//    }
//
//    static String getYear(int numberOfYears) {
//        StringBuilder sb = new StringBuilder();
//        if (numberOfYears == 0) {
//            sb.append("");
//        } else if (numberOfYears == 1) {
//            sb.append(numberOfYears).append(" ").append("year");
//        } else {
//            sb.append(numberOfYears).append(" ").append("years");
//        }
//        return sb.toString();
//    }
//
//    static String getDay(int numberOfDays) {
//        StringBuilder sb = new StringBuilder();
//        if (numberOfDays == 0) {
//            sb.append("");
//        } else if (numberOfDays == 1) {
//            sb.append(numberOfDays).append(" ").append("day");
//        } else {
//            sb.append(numberOfDays).append(" ").append("days");
//        }
//        return sb.toString();
//    }
//
//    static String getHour(int numberOfHours) {
//        StringBuilder sb = new StringBuilder();
//        if (numberOfHours == 0) {
//            sb.append("");
//        } else if (numberOfHours == 1) {
//            sb.append(numberOfHours).append(" ").append("hour");
//        } else {
//            sb.append(numberOfHours).append(" ").append("hours");
//        }
//        return sb.toString();
//    }
//
//    static String getMinute(int numberOfMinutes) {
//        StringBuilder sb = new StringBuilder();
//        if (numberOfMinutes == 0) {
//            sb.append("");
//        } else if (numberOfMinutes == 1) {
//            sb.append(numberOfMinutes).append(" ").append("minute");
//        } else {
//            sb.append(numberOfMinutes).append(" ").append("minutes");
//        }
//        return sb.toString();
//    }
//
//    static String getSecond(int numberOfSeconds) {
//        StringBuilder sb = new StringBuilder();
//        if (numberOfSeconds == 0) {
//            sb.append("");
//        } else if (numberOfSeconds == 1) {
//            sb.append(numberOfSeconds).append(" ").append("second");
//        } else {
//            sb.append(numberOfSeconds).append(" ").append("seconds");
//        }
//        return sb.toString();
//    }
//}
