package tudelft.Pruebas;

public class BinaryConverter {

    public int convert(String binary) {
        int result = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char digit = binary.charAt(i);

            if (digit == '1') {
                result += Math.pow(2, i); // ERROR: El exponente debe ser (length - 1 - i)
            } else if (digit != '0') {
                return -1; // ERROR: No maneja bien caracteres inválidos en algunas posiciones
            }
        }

        return result;
    }
}