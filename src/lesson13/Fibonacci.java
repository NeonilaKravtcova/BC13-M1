package lesson13;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(11);
    }

    public static void fibonacci(int n){
        int n1 = 1;
        int n2 = 1;
        for (int i = 3; i <= n; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n3 = n2;
            n2 = n1;
        }
    }
}
