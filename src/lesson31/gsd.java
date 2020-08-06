package lesson31;

public class gsd {
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(60, 15));
        System.out.println(greatestCommonDivisor(3367, 1001));
        System.out.println(greatestCommonDivisor(0, 1));
        System.out.println(greatestCommonDivisor(8, 9));

        System.out.println(lastCommonMultiple(60, 15));// 60
        System.out.println(lastCommonMultiple(8, 9));// 72
        System.out.println(lastCommonMultiple(7, 3));// 21
    }

    public static int lastCommonMultiple(int a, int b){
        return (a * b / greatestCommonDivisor(a, b));
    }

    public static int greatestCommonDivisor(int a, int b){
     if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }
}
