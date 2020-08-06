package lesson25;

public class BinaryDigit {
    public static void main(String[] args) {
        System.out.println(convertBinaryTODecimal(1001110));
        System.out.println(convertDecimalToBinary(78));
    }

    public static int convertBinaryTODecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0;
        while (binaryDigit > 0) {
            int temp = binaryDigit % 10;
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }
        return decimal;
    }

    public static String convertDecimalToBinary(int decimalDigit) {
        String output = "";
        int rest;
        while (decimalDigit > 0) {
            rest = decimalDigit % 2;
            output = rest + output;
            decimalDigit = decimalDigit / 2;
        }
        return output;
    }
}
