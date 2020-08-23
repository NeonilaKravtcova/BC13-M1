package lesson40;

public class Exercises_List03_02 {
    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1})); // → true
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1})); // → false
        System.out.println(canBalance(new int[]{10, 10})); // → true
    }

    public static boolean canBalance(int[] a) {
        boolean balance = false;
        for (int i = 0; i < a.length - 1; i++) {
            balance = arrayTwoSums(a, i);
            if (balance) break;
        }
        return balance;
    }

    public static boolean arrayTwoSums(int[] a, int n) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= n; i++) {
            sum1 += a[i];
        }
        for (int i = n + 1; i < a.length; i++) {
            sum2 += a[i];
        }
        //System.out.println("sum1 = " + sum1 + ", sum2 = " + sum2); - наглядная проверка работы метода
        return sum1 == sum2;
    }
}