package lesson31;

public class ExercisesArrays {
    public static void main(String[] args) {
        //Exercise 02
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] a3 = new int[]{7, 3, 2};
        int[] a4 = new int[]{1, 3};

        System.out.println(commonEnd(a1, a2));// → true
        System.out.println(commonEnd(a1, a3));// → false
        System.out.println(commonEnd(a1, a4));// → true
        System.out.println();

        //Exercise 03
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};

        reverse3(b1);// → [3, 2, 1]
        reverse3(b2);// → [9, 11, 5]
        reverse3(b3);// → [0, 0, 7]
        System.out.println();

        //Exercise 04
        int[] c1 = new int[]{1, 2, 3}; //2
        int[] c2 = new int[]{7, 7, 7}; //7
        int[] c3 = new int[]{5, 2, 9}; //5
        int[] d1 = new int[]{4, 5, 6}; //5
        int[] d2 = new int[]{3, 8, 0}; //3
        int[] d3 = new int[]{1, 4, 5}; //3

        middleWay(c1, d1);//→ [2, 5]
        middleWay(c2, d2);// → [7, 3]
        middleWay(c3, d3);// → [5, 3]
        System.out.println();
    }

    public static void middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = averageNumber(a);
        result[1] = averageNumber(b);
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static int averageNumber(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum / array.length;
    }

    public static void reverse3(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - i - 1];
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}

