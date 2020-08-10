package lesson31;

public class Exercises07_08 {
    public static void main(String[] args) {
        //Exercise 07
        int[] c1 = new int[]{1, 2, 3, 4};
        int[] c2 = new int[]{7, 1, 2, 3, 4, 9};
        int[] c3 = new int[]{1, 2};

        midThree(c1, 2); //→ [2, 3]
        midThree(c2, 2); //→ [2, 3]
        midThree(c3, 2); //→ [1, 2]
        System.out.println();

        //Exercise 08
        int[] d1 = new int[]{1, 2, 3, 4, 5};
        int[] d2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] d3 = new int[]{1, 2, 3};

        midThree(d1, 3); //→ [2, 3, 4]
        midThree(d2, 3); //→ [7, 5, 3]
        midThree(d3, 3); //→ [1, 2, 3]
    }

    public static void midThree(int[] a, int n){
        int m = (a.length - n) / 2;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = a[m];
            System.out.print(result[i] + " ");
            m++;
        }
        System.out.println();
    }
}
