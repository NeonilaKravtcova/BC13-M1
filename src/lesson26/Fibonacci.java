package lesson26;

public class Fibonacci {
    static int count = 0;
    public static void main(String[] args) {
        fibonacci(10);
        System.out.println("\n");
        System.out.print(fibonacciRecursion(10));
    }

    public static int fibonacciRecursion(int number) {
        count++;
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }

    public static void fibonacci(int number) {
        int n0 = 0;
        int n1 = 1;
        int nI;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= number; i++) {
            nI = n0 + n1;
            System.out.print(nI + " ");
            n0 = n1;
            n1 = nI;
        }
    }
}
