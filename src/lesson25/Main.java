package lesson25;

public class Main {
    public static void main(String[] args) {
        int binaryLikeDecimal = 1001110;
        int binaryLikeBinary = 0b100_1110;
        long l = 12_376_384_758_905_968L; // используем нижнее подчёркивание для облегчения
        // восприятия числа; они всегда игнорируются.
        System.out.println(binaryLikeDecimal);
        System.out.println(binaryLikeBinary);
    }
}
