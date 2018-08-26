package monmar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDivisorTest {

    @Test
    public void shouldReturnEightDivisors(){
        FindDivisor findDivisor = new FindDivisor();

        assertEquals(8, findDivisor.numberOfDivisors(30));

    }
}
