package lesson43;

import java.util.Arrays;

public class HW43_CocktailSort_Byte {
    public static void main(String[] args) {
        byte[] myArray = createArray(10);
        System.out.println("Исходный массив byte:          " + Arrays.toString(myArray));
        byte[] myArrayCopy1 = copyArray(myArray);
        System.out.println("1-ая копия исходного массива : " + Arrays.toString(myArray));
        byte[] mySortedArray = bubbleSort(myArrayCopy1);
        System.out.println("Bubblesort копии массива:      " + Arrays.toString(mySortedArray));
        byte[] myArrayCopy2 = copyArray(myArray);
        System.out.println("2-ая копия исходного массива : " + Arrays.toString(myArray));
        byte[] mySchakedArray = schakeSort(myArrayCopy2);
        System.out.println("Schakesort копии массива:      " + Arrays.toString(mySchakedArray));
        System.out.println("Проверка исходный массив:      " + Arrays.toString(myArray));
    }

    public static byte[] schakeSort(byte[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    byte temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    byte temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            start++;
        }
        return array;
    }

    public static byte[] copyArray(byte[] array) {
        byte[] output = new byte[array.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = array[i];
        }
        return output;
    }

    public static byte[] bubbleSort(byte[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                byte temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }
        return array;
    }

    public static byte[] createArray(int n) {
        byte[] output = new byte[n];
        for (int i = 0; i < n; i++) {
            output[i] = (byte) (Math.random() * 100);
        }
        return output;
    }
}
