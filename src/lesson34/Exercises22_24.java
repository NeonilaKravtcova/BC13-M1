package lesson34;

import java.util.Arrays;

public class Exercises22_24 {
    public static void main(String[] args) {
        //Exercise 22
        int[] a1 = new int[]{2, 5};
        int[] a2 = new int[]{4, 3};
        int[] a3 = new int[]{4, 5};
        System.out.println(has23(a1));// true
        System.out.println(has23(a2));// true
        System.out.println(has23(a3));// false
        System.out.println();

        //Exercise 23
        int[] b1 = new int[]{2, 2};
        int[] b2 = new int[]{3, 3};
        int[] b3 = new int[]{2, 3};
        System.out.println(double23(b1));// → true
        System.out.println(double23(b2));// → true
        System.out.println(double23(b3));// → false
        System.out.println();

        //Exercise 24
        int[] c1 = new int[]{1, 2};
        int[] c2 = new int[]{3, 4};
        int[] c3 = new int[]{3, 4};
        int[] c4 = new int[]{1, 2};
        int[] c5 = new int[]{1, 1};
        int[] c6 = new int[]{1, 2};
        System.out.println(Arrays.toString(biggerTwo(c1, c2)));// → [3, 4]
        System.out.println(Arrays.toString(biggerTwo(c3, c4)));// → [3, 4]
        System.out.println(Arrays.toString(biggerTwo(c5, c6)));// → [1, 2]
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sum1 = sumArray(a);
        int sum2 = sumArray(b);
        if (sum1 >= sum2) return a;
        else return b;
    }

    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static boolean double23(int[] a) {
        return a[0] == 2 && a[1] == 2 || a[0] == 3 && a[1] == 3;
    }

    private static boolean has23(int[] a) {
        for (int i : a) {
            if (i == 2) {
                return true;
            } else if (i == 3) {
                return true;
            }
        }
        return false;
    }
}

