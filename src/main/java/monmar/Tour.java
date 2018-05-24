package monmar;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class Tour {

    public static int tour(final String[] friends, final String[][] friendTowns, final Map<String, Double> distancesFromHome) {
        final Map<String, String> addressBook = Stream.of(friendTowns).collect(toMap(e -> e[0], e -> e[1]));

        final List<Double> dists = Stream.of(
                Stream.of(0.0),
                Stream.of(friends).map(addressBook::get).filter(Objects::nonNull).map(distancesFromHome::get).filter(Objects::nonNull),
                Stream.of(0.0)
        ).flatMap(identity()).collect(toList());

        return (int) IntStream.range(0, dists.size() - 1).mapToDouble(i -> {
            final double a = dists.get(i);
            final double c = dists.get(i + 1);
            return Math.sqrt(Math.abs(c * c - a * a));
        }).sum();
    }



//    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
//        Map<String, String> mapOfTowns = new HashMap<>();
//        Map<String, Double> distanceToFriendsMap = new TreeMap<>();
//        Arrays.stream(ftwns).forEach(t -> mapOfTowns.put(t[0], t[1]));
//        for (String s : arrFriends){
//            if(Optional.ofNullable(h.get(mapOfTowns.get(s))).orElse(0.0)!=0.0) {
//                distanceToFriendsMap.put(s, h.get(mapOfTowns.get(s)));
//            }
//        }
//
//        List<Double> listOfDistance = new ArrayList<>();
//        listOfDistance = distanceToFriendsMap.values().stream().collect(toList());
//        double distance = 0.0;
//        for (int i = 0; i<listOfDistance.size()-1;i++){
//            distance += Math.sqrt(Math.pow(listOfDistance.get(i+1),2) - Math.pow(listOfDistance.get(i),2));
//        }
//        return (int) distance + listOfDistance.get(0).intValue()+listOfDistance.get(listOfDistance.size()-1).intValue();
//    }
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
