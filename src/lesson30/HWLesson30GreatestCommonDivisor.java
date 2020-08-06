package lesson30;

public class HWLesson30GreatestCommonDivisor {
    public static void main(String[] args) {
        GreatestCommonDivisor(3367, 1001);
        GreatestCommonDivisor(1001, 3367);
        GreatestCommonDivisor(1000, 3367);
        GreatestCommonDivisor(0, 100);
        GreatestCommonDivisor(80, 0);
        GreatestCommonDivisor(0, 0);
        GreatestCommonDivisor(5, 1);
        GreatestCommonDivisor(54, 30);
        GreatestCommonDivisor(54, 54);
    }

    public static void GreatestCommonDivisor(int m, int n) {
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        System.out.println("НОД (" + m + "; " + n + ") = " + checkMod(max, min) +
                "      НОК (" + m + "; " + n + ") = " + lowestCommonMultiple(max, min));
    }

    public static int checkMod(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int mod = a % b;
        if (mod != 0) {
            a = b;
            b = mod;
            return checkMod(a, b);
        } else {
            return b;
        }
    }

    public static int lowestCommonMultiple(int a, int b) {
        if (a == 0 || b == 0) return 0;
        else return a * b / checkMod(a, b);
    }
}