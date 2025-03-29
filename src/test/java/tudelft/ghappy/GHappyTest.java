package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    @org.junit.Test
    @Test
    public void testAllHappyGs() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("xxggxx"));
    }

    @Test
    public void testSingleUnhappyG() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    public void testUnhappyGAtEnd() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("xxggyygxx"));
    }

    @Test
    public void testNoGs() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("abcdef"));
    }

    @Test
    public void testOnlyHappyGs() {
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("gggg"));
    }

    @Test
    public void testSingleG() {
        GHappy gHappy = new GHappy();
        assertFalse(gHappy.gHappy("g"));
    }
}
