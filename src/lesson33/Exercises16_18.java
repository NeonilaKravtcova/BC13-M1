package lesson33;

import java.util.Arrays;

public class Exercises16_18 {
    public static void main(String[] args) {
        //Exercise 16
        int[] b1 = new int[]{1, 2};
        int[] b2 = new int[]{3, 4};
        int[] b3 = new int[]{4, 4};
        int[] b4 = new int[]{2, 2};
        int[] b5 = new int[]{9, 2};
        int[] b6 = new int[]{3, 4};
        myArrayPrint(plusTwo(b1, b2)); //→ [1, 2, 3, 4]
        myArrayPrint(plusTwo(b3, b4)); // → [4, 4, 2, 2]
        myArrayPrint(plusTwo(b5, b6)); // → [9, 2, 3, 4]
        System.out.println();

        //Exercise 17
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 5, 3};
        int[] c3 = new int[]{5, 2, 3};
        maxTriple(c1); //→ 3
        maxTriple(c2); //→ 5
        maxTriple(c3); //→ 5
        System.out.println();

        //Exercise 18
        int[] d1 = new int[]{4, 5};
        int[] d2 = new int[]{1, 2, 3};
        int[] d3 = new int[]{4};
        int[] d4 = new int[]{1, 2, 3};
        int[] d5 = new int[]{};
        int[] d6 = new int[]{1, 2};
        myArrayPrint(make2(d1, d2)); //→ [4, 5]
        myArrayPrint(make2(d3, d4)); //→ [4, 1]
        myArrayPrint(make2(d5, d6)); //→ [1, 2]
        System.out.println();
    }

    public static int[] make2(int[] a, int[] b){
        int[] output = new int[2];
        if (a.length == 2) {
            output = Arrays.copyOf(a,2);
        } else if (a.length == 1) {
            output[0] = a[0];
            output[1] = b[0];
        } else output = Arrays.copyOf(b,2);
        return output;
    }

    public static void maxTriple(int[] a){
        Arrays.sort(a);
        System.out.println(a[a.length - 1]);
    }

    public static int[] plusTwo(int[] a, int[] b){
        int[] output = new int[a.length + b.length];
        System.arraycopy(a, 0, output, 0, a.length);
        System.arraycopy(b, 0, output, a.length, b.length);
        return output;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int i : arrayToPrint) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}


