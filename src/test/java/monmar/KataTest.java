package monmar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
