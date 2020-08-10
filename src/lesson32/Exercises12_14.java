package lesson32;

import java.util.Arrays;

public class Exercises12_14 {
    public static void main(String[] args) {
        //Exercise 12
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{11, 5, 9};
        int[] a3 = new int[]{2, 11, 3};
        myArrayPrint(maxEnd3(a1)); //→ [3, 3, 3]
        myArrayPrint(maxEnd3(a2)); //→ [11, 11, 11]
        myArrayPrint(maxEnd3(a3)); //→ [3, 3, 3]
        System.out.println();

        //Exercise 13
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 2, 3, 4};
        int[] b3 = new int[]{7, 4, 6, 2};
        myArrayPrint(makeEnds(b1));// → [1, 3]
        myArrayPrint(makeEnds(b2));// → [1, 4]
        myArrayPrint(makeEnds(b3));// → [7, 2]
        System.out.println();

        //Exercise 14
        int[] c1 = new int[]{4, 5, 6};
        int[] c2 = new int[]{1, 2};
        int[] c3 = new int[]{3};
        myArrayPrint(makeLast(c1));// → [0, 0, 0, 0, 0, 6]
        myArrayPrint(makeLast(c2));// → [0, 0, 0, 2]
        myArrayPrint(makeLast(c3));// → [0, 3]
    }

    public static int[] makeLast(int[] input){
        int[] output = new int[input.length * 2];
        //Arrays.fill(output, 0, output.length - 2, 0);
        output[output.length - 1] = input[input.length - 1];
        return output;
    }

    public static int[] makeEnds(int[] a) {
        return new int[]{a[0], a[a.length - 1]};
    }

    public static int[] maxEnd3(int[] input) {
        int max = Math.max(input[0], input[input.length - 1]);
        Arrays.fill(input, max);
        return input;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        //System.out.println("Длина массива - " + arrayToPrint.length);
        for (int i : arrayToPrint) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



