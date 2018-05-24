package monmar;

import java.util.*;
import java.util.stream.Collectors;

public class Tour {
    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        Map<String, String> mapOfTowns = new HashMap<>();
        Map<String, Double> distanceToFriendsMap = new TreeMap<>();
        Arrays.stream(ftwns).forEach(t -> mapOfTowns.put(t[0], t[1]));
        for (String s : arrFriends){
            if(Optional.ofNullable(h.get(mapOfTowns.get(s))).orElse(0.0)!=0.0) {
                distanceToFriendsMap.put(s, h.get(mapOfTowns.get(s)));
            }
        }

        List<Double> listOfDistance = new ArrayList<>();
        listOfDistance = distanceToFriendsMap.values().stream().collect(Collectors.toList());
        double distance = 0.0;
        for (int i = 0; i<listOfDistance.size()-1;i++){
            distance += Math.sqrt(Math.pow(listOfDistance.get(i+1),2) - Math.pow(listOfDistance.get(i),2));
        }
        return (int) distance + listOfDistance.get(0).intValue()+listOfDistance.get(listOfDistance.size()-1).intValue();
    }
}


//    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
//        double totaldist = 0;
//        double prevdist = 0;
//        for (int a = 0; a < arrFriends.length; a++)
//            for (String[] fTown : ftwns)
//                if (fTown[0].equals(arrFriends[a])) {
//                    double d = h.get(fTown[1]);
//                    totaldist += Math.sqrt(Math.pow(d, 2) - Math.pow(prevdist, 2));
//                    prevdist = d;
//                }
//        return (int) (totaldist + prevdist);
//    }
