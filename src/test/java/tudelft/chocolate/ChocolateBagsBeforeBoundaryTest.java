package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(5, 3, 17);
        assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(4, 2, 3);
        assertEquals(3, result);
    }
    @Test
    public void TestExacto() {
        ChocolateBags cb = new ChocolateBags();
        assertEquals(0, cb.calculate(3, 2, 10));
    }

    @Test
    public void TestSmall() {
        ChocolateBags cb = new ChocolateBags();
        assertEquals(1, cb.calculate(1, 3, 16));
    }

    @Test
    public void TestsinSolucion() {
        ChocolateBags cb = new ChocolateBags();
        assertEquals(-1, cb.calculate(2, 1, 9));
    }
}
