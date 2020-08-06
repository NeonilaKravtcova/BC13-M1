package lesson31;

public class Exercises05 {
    public static void main(String[] args) {
        //Exercise 05
        int[] a1 = new int[]{4, 5};//→ true
        int[] a2 = new int[]{4, 2};//→ false
        int[] a3 = new int[]{3, 5};//→ false
        System.out.println(no23(a1));
        System.out.println(no23(a2));
        System.out.println(no23(a3));
        System.out.println();

        //Exercise 06
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{2, 3, 5};
        int[] b3 = new int[]{1, 2, 1};

        fix23(b1);// → [1, 2, 0]
        fix23(b2);// → [2, 0, 5]
        fix23(b3);// → [1, 2, 1]

        //Exercise 07
        int[] c1 = new int[]{1, 2, 3, 4};
        int[] c2 = new int[]{7, 1, 2, 3, 4, 9};
        int[] c3 = new int[]{1, 2, 3};

        midThree(c1, 2); //→ [2, 3]
        midThree(c2, 2); //→ [7, 5]
        midThree(c3, 2); //→ [1, 2]
    }

    public static void midThree(int[] a, int n){
        int m = (a.length - 2) / 2;
        int[] result = new int[]{};
        for (int i = 0; i < 2; i++) {
            result[i] = a[m];
            m = m + 1;
        }
        for (int i = m; i < a.length - m; i++) {
            for (int j = 0; j < 3; j++) {
               result[j] =  
            }

        }
    }

    public static void fix23(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 2) {
                if (a[i + 1] == 3) {
                    a[i + 1] = 0;
                }
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean no23(int[] a) {
        for (int i : a) {
            if (i == 2 || i == 3) return false;
        }
        return true;
    }
}
