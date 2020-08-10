package lesson31;

//import java.util.stream.IntStream;

public class Exercises09_11 {

    public static void main(String[] args) {
        //Exercise 09
        int[] a1 = new int[]{1, 3, 4, 5};
        int[] a2 = new int[]{2, 1, 3, 4, 5};
        int[] a3 = new int[]{1, 1, 1};

        System.out.println(unlucky1(a1));//→ true
        System.out.println(unlucky1(a2));//→ true
        System.out.println(unlucky1(a3));//→ false
        System.out.println();

        //Exercise 10
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 2, 3, 1};
        int[] b3 = new int[]{1, 2, 1};

        System.out.println(sameFirstLast(b1));//→ false
        System.out.println(sameFirstLast(b2));//→ true
        System.out.println(sameFirstLast(b3));//→ true
        System.out.println();

        //Exercise 11
        int[] c1 = new int[]{1, 2, 3};// → 6
        int[] c2 = new int[]{5, 11, 2};// → 18
        int[] c3 = new int[]{7, 0, 0};// → 7

        System.out.println(sum3(c1));
        System.out.println(sum3(c2));
        System.out.println(sum3(c3));
    }

    private static int sum3(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    private static boolean sameFirstLast(int[] a){
        if (a.length > 1) {
            return a[0] == a[a.length - 1];
        } else return false;
    }

    private static boolean unlucky1(int[] a){
        for (int i = 0; i < a.length; i++) {
            if ((i < 2 && a[i] == 1 && a[i + 1] == 3) || (a[a.length - 2] == 1 && a[a.length - 1] == 3)){
                return true;
                /*return IntStream.range(0, a.length).anyMatch(i -> (i < 2 && a[i] == 1 && a[i + 1] == 3) ||
                        (a[a.length - 2] == 1 && a[a.length - 1] == 3)); - что это такое? Тоже работает.*/
            }
        }
        return false;
    }
}
