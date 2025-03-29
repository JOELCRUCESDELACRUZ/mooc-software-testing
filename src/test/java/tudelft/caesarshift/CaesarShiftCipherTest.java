package tudelft.caesarshift;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
    @Test
    void PruebaCifrado1() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("jqnc", csc.CaesarShiftCipher("hola", 2));
    }
    @Test
    void PruebaCifrado2() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("cem", csc.CaesarShiftCipher("zbj", 3));
    }
    @Test
    void PruebaCifrado3() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("jq nc", csc.CaesarShiftCipher("ho la", 2));
    }
    @Test
    void PruebaCifrado4() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        assertEquals("rnt", csc.CaesarShiftCipher("mio", 5));
    }

}
