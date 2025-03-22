package tudelft.Pruebas.;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryConverterTest {

    @Test
    public void singleZero() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("0");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void singleOne() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("1");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void twoDigits() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("10");
        Assertions.assertEquals(2, result); // ERROR: Fallará por el cálculo de la potencia
    }

    @Test
    public void threeDigits() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("101");
        Assertions.assertEquals(5, result); // ERROR
    }

    @Test
    public void fourDigits() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("1101");
        Assertions.assertEquals(13, result); // ERROR
    }

    @Test
    public void leadingZeros() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("000101");
        Assertions.assertEquals(5, result); // ERROR
    }

    @Test
    public void allOnes() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("1111");
        Assertions.assertEquals(15, result); // ERROR
    }

    @Test
    public void alternatingOnesAndZeros() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("101010");
        Assertions.assertEquals(42, result); // ERROR
    }

    @Test
    public void onlyZeros() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("0000");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void invalidCharacterMiddle() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("10A1");
        Assertions.assertEquals(-1, result); // ERROR: No maneja bien caracteres inválidos
    }

    @Test
    public void invalidCharacterStart() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("A101");
        Assertions.assertEquals(-1, result); // ERROR
    }

    @Test
    public void invalidCharacterEnd() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("101B");
        Assertions.assertEquals(-1, result); // ERROR
    }

    @Test
    public void emptyString() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("");
        Assertions.assertEquals(0, result); // ERROR: No maneja bien strings vacíos
    }

    @Test
    public void multipleInvalidCharacters() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("1X0Y1");
        Assertions.assertEquals(-1, result); // ERROR
    }

    @Test
    public void longBinaryNumber() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("100110111");
        Assertions.assertEquals(311, result); // ERROR
    }

    @Test
    public void veryLargeBinary() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("111111111111");
        Assertions.assertEquals(4095, result); // ERROR
    }

    @Test
    public void randomBinarySequence() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("11011011");
        Assertions.assertEquals(219, result); // ERROR
    }

    @Test
    public void singleDigitInvalid() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("X");
        Assertions.assertEquals(-1, result); // ERROR
    }

    @Test
    public void spacesBetweenBinary() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("10 10");
        Assertions.assertEquals(-1, result); // ERROR
    }

    @Test
    public void newlineCharacter() {
        BinaryConverter converter = new BinaryConverter();
        int result = converter.convert("101\n");
        Assertions.assertEquals(-1, result); // ERROR
    }
}