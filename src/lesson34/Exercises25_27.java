package lesson34;

import java.util.Arrays;

public class Exercises25_27 {
    public static void main(String[] args) {
        //Exercise 25
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{1, 2, 3};
        int[] a3 = new int[]{8, 6, 7, 9, 5};
        System.out.println(Arrays.toString(swapEnds(a1)));//→ [4, 2, 3, 1]
        System.out.println(Arrays.toString(swapEnds(a2)));// → [3, 2, 1]
        System.out.println(Arrays.toString(swapEnds(a3)));// → [5, 6, 7, 9, 8]
        System.out.println();

        //Exercise 26
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 2};
        int[] b3 = new int[]{1};
        System.out.println(Arrays.toString(frontPiece(b1)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(b2)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(b3)));// → [1]
        System.out.println();

        //Exercise 27
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{7, 9, 8};
        int[] c3 = new int[]{1};
        int[] c4 = new int[]{2};
        int[] c5 = new int[]{1, 7};
        int[] c6 = new int[]{};
        int[] c7 = new int[]{};
        int[] c8 = new int[]{};

        System.out.println(Arrays.toString(front11(c1, c2)));// → [1, 7]
        System.out.println(Arrays.toString(front11(c3, c4)));// → [1, 2]
        System.out.println(Arrays.toString(front11(c5, c6)));// → [1]
        System.out.println(Arrays.toString(front11(c7, c8)));// → []
        System.out.println();
    }

    public static int[] front11(int[] a, int[] b) {
        int[] output;
        if (a.length == 0 && b.length == 0) {
            output = a;
        } else if (a.length > 0 && b.length > 0) {
            output = new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            output = new int[]{a[0]};
        } else {
            output = new int[]{b[0]};
        }
        return output;
    }

    public static int[] frontPiece(int[] a) {
        int[] output;
        if (a.length >= 2) {
            output = new int[]{a[0], a[1]};
        } else output = a;
        return output;
    }

    public static int[] swapEnds(int[] a) {
        int temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
        return a;
    }
}