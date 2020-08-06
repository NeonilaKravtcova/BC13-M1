package lesson25;

public class LogicExercises08_09 {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9)); //→ 4
        System.out.println(makeChocolate(4, 1, 10)); // → -1
        System.out.println(makeChocolate(4, 1, 7)); // → 2
        System.out.println("\n");

        System.out.println(evenlySpaced(2, 4, 6)); // → true
        System.out.println(evenlySpaced(4, 6, 2)); // → true
        System.out.println(evenlySpaced(4, 6, 3)); // → false
    }

    //Exercise 09
    private static boolean evenlySpaced(int a, int b, int c) {
        return Math.abs(a - b) == Math.abs(b - c) ||
                Math.abs(a - c) == Math.abs(b - c) ||
                Math.abs(a - c) == Math.abs(a - b);
    }

    //Exercise 08
    private static int makeChocolate(int smallBar, int bigBar, int yourOrder) {
        if (bigBar * 5 + smallBar >= yourOrder) return yourOrder - bigBar * 5;
        return -1;
    }


}
