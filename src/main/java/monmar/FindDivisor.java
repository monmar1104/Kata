package monmar;

import java.util.stream.IntStream;

public class FindDivisor {

    public long numberOfDivisors(int n){

        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).count();
    }
}
