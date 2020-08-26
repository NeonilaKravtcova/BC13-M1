package lesson43;

import java.util.Arrays;

public class CocktailSort {
    public static void main(String[] args) {
        int[] myArrayOriginal = createArray(20);
        System.out.println("Исходный массив:        " + Arrays.toString(myArrayOriginal));
        int[] myArrayCopy1 = arrayCopy(myArrayOriginal);
        int[] myArrayCopy2 = arrayCopy(myArrayOriginal);
        System.out.println("Скопированный массив:   " + Arrays.toString(myArrayCopy1));
/*        int[] myArraySorted = bubbleSort(myArrayCopy);
        System.out.println("Скопированный массив:   " + Arrays.toString(bubbleSort(myArrayCopy)));*/
        System.out.println("Отсортированный массив: " + Arrays.toString(bubbleSort(myArrayCopy1)) + " bubblesort");
        System.out.println("Отсортированный массив: " + Arrays.toString(cocktailSort(myArrayCopy2)) + " cocktailsort");
    }

    public static int[] cocktailSort(int[] array) {
        int count = 0;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int j = 0; j < end; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (array[k] < array[k - 1]) {
                    int temp = array[k];
                    array[k] = array[k - 1];
                    array[k - 1] = temp;
                    swapped = true;
                }
            }
            start++;
            count++;
            if (!swapped) {
                break;
            }
            System.out.println("Шаг №: " + count);
        }
        return array;
    }

    //Делаем копию созданного массива
    public static int[] arrayCopy(int[] array) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static int[] createArray(int n) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }

    public static int[] bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }
        System.out.println("Шаг №: " + count);
        return array;
    }
}
