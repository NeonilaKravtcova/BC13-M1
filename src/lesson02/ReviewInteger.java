package lesson02;

public class ReviewInteger {
    public static void main(String[] args) {
        byte b = 10;
        byte c = 127;
        byte sum = (byte) (b + c);

        short s0 = 11_111;
        short s1 = 7_777;
        short sumShort = (short) (s0 + s1);

        int variableOne = 27;
        int variableTwo = 49;
        int variableSum = variableOne + variableTwo;
        System.out.println("Сумма двух переменных с типом данных int = " + variableSum);

        long l1 = 2532563635L;
        long l2 = 7854699556656l;
        long l3 = 35_467_687_569_876L;

    }
}
