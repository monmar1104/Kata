package monmar;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Xbonacci {
    public double[] xbonacci(double[] signature, int n) {
        int x = signature.length;
        double[] result = Arrays.copyOf(signature, n);
        for (int i = x; i < n; i++)
            result[i] = IntStream.range(i-x, i).mapToDouble(k -> result[k]).sum();
        return result;
    }
}
