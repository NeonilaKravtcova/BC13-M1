package lesson33;

public class Exercises15 {
    public static void main(String[] args) {
        //Exercise 15
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 3};
        int[] a3 = new int[]{7, 2, 3};
        int[] a4 = new int[]{1};
        int[] a5 = new int[]{1, 2};
        int[] a6 = new int[]{};
        System.out.println(start1(a1, a2)); //→2
        System.out.println(start1(a3, a4)); //→1
        System.out.println(start1(a5, a6)); //→1
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }
}
