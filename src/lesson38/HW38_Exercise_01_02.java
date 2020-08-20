package lesson38;

public class HW38_Exercise_01_02 {
    public static void main(String[] args) {
        //Exercise 01 from 10-Java-Exercises-Arrays-02 - было легко
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); //→ 3
        System.out.println(countEvens(new int[]{2, 2, 0})); //→ 3
        System.out.println(countEvens(new int[]{1, 3, 5})); //→ 0
        System.out.println();

        //Exercise 01 from 11-Java-Exercises-Arrays-03 - 5 часов
        System.out.println(maxSpan(spans(new int[]{1, 2, 1, 1, 3}))); //→ 4
        System.out.println(maxSpan(spans(new int[]{1, 4, 2, 1, 4, 1, 4}))); //→ 6
        System.out.println(maxSpan(spans(new int[]{1, 4, 2, 1, 4, 4, 4}))); //→ 6

        //Это оставляю, чтобы можно было раскомментить и проверить, как работает метод spans
/*      System.out.println(Arrays.toString(spans(new int[]{1, 2, 1, 1, 3})));
        System.out.println(Arrays.toString(spans(new int[]{1, 4, 2, 1, 4, 1, 4})));
        System.out.println(Arrays.toString(spans(new int[]{1, 4, 2, 1, 4, 4, 4})));*/
    }

    //Этот метод создёт массив расстояний между одинаковыми элементами входящего массива
    public static int[] spans(int[] a) {
        int[] spansArray = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            spansArray[i] = a.length - i;
            int j = a.length;
            while (a[i] != a[j - 1]) {
                j--;
                spansArray[i] = j - i;
            }
        }
        return spansArray;
    }

    //Это мой долг по нахождению наибольшего элемента массива
    public static int maxSpan(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int countEvens(int[] a) {
        int count = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                count++;//можно написать ++count
            }
        }
        return count;
    }
}