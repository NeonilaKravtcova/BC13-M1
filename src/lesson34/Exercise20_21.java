package lesson34;

import java.util.Arrays;

public class Exercise20_21 {
    public static void main(String[] args) {
        //Exercise 20
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};
        System.out.println(Arrays.toString(rotateLeft3(a1)));// → [2, 3, 1]
        System.out.println(Arrays.toString(rotateLeft3(a2)));// → [11, 9, 5]
        System.out.println(Arrays.toString(rotateLeft3(a3)));// → [0, 0, 7]
        System.out.println();

        //Exercise 21
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 1};
        int[] b3 = new int[]{1, 1, 1, 1};
        System.out.println(sum2(b1)); //3
        System.out.println(sum2(b2)); //2
        System.out.println(sum2(b3)); //2

    }

    public static int sum2(int[] a) {
        if (a.length >= 2) return a[0] + a[1];
        else if (a.length == 1) return a[0];
        else return 0;
    }

    public static int[] rotateLeft3(int[] a) {
        int[] output = new int[a.length];
        if (a.length - 1 >= 0) {
            System.arraycopy(a, 1, output, 0, a.length - 1);
        }
        output[a.length - 1] = a[0];
        return output;
    }
}
