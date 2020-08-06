package lesson25;

public class HomeworkLesson25LogicExercises {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8)); // → true
        System.out.println(makeBricks(3, 1, 9)); // → false
        System.out.println(makeBricks(3, 2, 10)); // → true
        System.out.println("\n");

        System.out.println(noTeenSum(1, 2, 3)); // -> 6
        System.out.println(noTeenSum(2, 13, 1)); // -> 3
        System.out.println(noTeenSum(2, 1, 14)); // -> 3
        System.out.println("\n");

        System.out.println(blackjack(19, 21)); // → 21
        System.out.println(blackjack(21, 19)); // → 21
        System.out.println(blackjack(19, 22)); // → 19
        System.out.println("\n");

        System.out.println(loneSum(1, 2, 3)); // → 6
        System.out.println(loneSum(3, 2, 3)); // → 2
        System.out.println(loneSum(3, 3, 3)); // → 0
    }

    //Exercise 04
    private static int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        else if (a == b) return c;
        else if (a == c) return b;
        else if (b == c) return a;
        else return a + b + c;
    }

    //Exercise 03
    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        else if (a > 21) return b;
        else if (b > 21) return a;
        else return Math.max(a, b);
    }

    //Exercise 02
    public static int noTeenSum(int a, int b, int c) {
        return (fixTeen(a) + fixTeen(b) + fixTeen(c));
    }

    public static int fixTeen(int n) {
        if (n == 13 || n == 14 || (n > 16 && n <= 19)) return 0;
        else return n;
    }

    //Exercise 01
    private static boolean makeBricks(int small, int big, int length) {
        int lengthSmall = 1;
        int lengthBig = 5;
        return length - small * lengthSmall - big * lengthBig <= 0;
    }
}
