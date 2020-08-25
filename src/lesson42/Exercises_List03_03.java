package lesson42;

import java.util.Arrays;

public class Exercises_List03_03 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));// → [1, 1, 2, 1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4)));// → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2)));// → [1, 1, 2]
        System.out.println(Arrays.toString(seriesUp(1)));// → [1]
        System.out.println(Arrays.toString(seriesUp(0)));// → []
    }

    public static int[] seriesUp(int n) {
        int[] output = new int[n * (n + 1) / 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                output[(i - 1) * i / 2 + j] = j + 1;
            }
        }
        return output;
    }
}
