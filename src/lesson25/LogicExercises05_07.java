package lesson25;

public class LogicExercises05_07 {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18)); // → 60
        System.out.println(roundSum(12, 13, 14)); // → 30
        System.out.println(roundSum(6, 4, 4)); // → 10
        System.out.println("\n");

        System.out.println(luckySum(1, 2, 3)); // →6
        System.out.println(luckySum(1, 2, 13)); // →3
        System.out.println(luckySum(1, 13, 3)); // →1
        System.out.println("\n");

        System.out.println(closeFar(1, 2, 10)); // → true
        System.out.println(closeFar(1, 2, 3)); // → false
        System.out.println(closeFar(4, 1, 3)); // → true
    }

    //Exercise 07
    private static boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) <= 1 && (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2)) return true;
        else return Math.abs(c - a) <= 1 && (Math.abs(b - a) >= 2 && Math.abs(c - b) >= 2);
    }

    //Exercise 06
    private static int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        else if (b == 13) return a;
        else if (c == 13) return a + b;
        else return a + b + c;
    }

    //Exercise 05
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        int modulo = num % 10;
        if (modulo >= 5) return num - modulo + 10;
        else return num - modulo;
    }
}
