package lesson40;

import java.util.Arrays;

public class MagicArray {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(createArray(10, 100))); //моя версия
        int[] myArray = createArray(10, 100);
        System.out.println(Arrays.toString(myArray));
        int[] sortArray = mySortArray(myArray);
        System.out.println(Arrays.toString(sortArray));
        int[] sortArray1 = getMySortArray(myArray);
        System.out.println(Arrays.toString(sortArray1));
        int[] sortArray2 = bubbleSort(myArray);
        System.out.println(Arrays.toString(sortArray2));
    }
      //Мой метод пузырьковой сортировки
    public static int[] mySortArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] != a[j + 1]) {
                    int temp = a[j];
                    a[j] = Math.min(temp, a[j + 1]);
                    a[j + 1] = Math.max(temp, a[j + 1]);
                }
            }
        }
        return a;
    }

    //Метод, который писали в классе, 1-ый вариант
    public static int[] getMySortArray(int[] a) {
            boolean unsorted = true;
            while (unsorted) {
                unsorted = false;
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        unsorted = true;
                    }
                }
            }
        return a;
    }

    //Метод, который писали в классе, 2-ой вариант
    public static int[] bubbleSort(int[] a) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    count++;
                }
            }
        }
        return a;
    }

    public static int[] createArray(int length, int diapason) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * diapason);
        }
        return array;
    }
}
