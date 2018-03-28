package monmar;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class KataTest {
    Kata kata = new Kata();

    @Test
    public void test01() {
        assertEquals("TTTT", kata.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", kata.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", kata.makeComplement("GTAT"));
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests calculateYears");
        assertEquals(3, Kata.calculateYears(1000,0.05,0.18,1100));
        assertEquals(14 , Kata.calculateYears(1000,0.01625,0.18,1200));
        assertEquals(0, Kata.calculateYears(1000,0.05,0.18,1000));
    }

    @Test
    public void findShort() throws Exception {
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
    }
    @Test
    public void testSomething1() {
        assertEquals(true, kata.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, kata.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, kata.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, kata.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, kata.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, kata.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, kata.getXO("Xxxxertr34"));
    }
    @Test
    public void compareStrings() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", kata.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", kata.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", kata.longest("inmanylanguages", "theresapairoffunctions"));
    }

    @Test
    public void exampleTests() {
        assertEquals(8, Kata.dontGiveMeFive(1,9));
        assertEquals(12, Kata.dontGiveMeFive(4,17));
    }

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, kata.getCount("abracadabra"));
    }

    @Test
    public void testCase2() {
        assertEquals("Nope!", 11, kata.getCount("abra   cadabra  aafsdeeee"));
    }


        @Test
        public void Tests() {
            assertEquals( "Nope!" , kata.digital_root(146), 2);
        }

    @Test
    public void tests() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void testJaden() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", kata.toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", kata.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is null", kata.toJadenCase(""));
    }
    @Test
    public void TestDigit1() {
        assertEquals(1, kata.digPow(89, 1));
    }
    @Test
    public void TestDigit2() {
        assertEquals(-1, kata.digPow(92, 1));
    }
    @Test
    public void TestDigit3() {
        assertEquals(51, kata.digPow(46288, 3));
    }

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, kata.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, kata.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, kata.duplicateCount("indivisibility"));
    }

    @Test
    public void changeWeightInRighOrderTest(){
        assertThat(kata.changeWeightInRighOrder("56 65 74 100 99 68 86 180 90"), is("100 180 90 56 65 74 68 86 99"));
    }
    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, Kata.inArray(a, b));
    }

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfWordIsInString() {
        System.out.println("Fixed Tests scramble");
        testing(Kata.scramble("rkqodlw","world"), true);
        testing(Kata.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(Kata.scramble("katas","steak"),false);
        testing(Kata.scramble("scriptjavx","javascript"),false);
        testing(Kata.scramble("scriptingjava","javascript"),true);
        testing(Kata.scramble("scriptsjava","javascripts"),true);
        testing(Kata.scramble("javscripts","javascript"),false);
        testing(Kata.scramble("aabbcamaomsccdd","commas"),true);
        testing(Kata.scramble("commas","commas"),true);
        testing(Kata.scramble("sammoc","commas"),true);
    }


}
