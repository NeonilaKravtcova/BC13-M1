package lesson42;

import java.util.Arrays;

public class CharSort {
    public static void main(String[] args) {
        char[] arrayChar = createCharArray(10); // создаём массив char
        System.out.println(Arrays.toString(arrayChar)); // распечатываем массив char
        System.out.println();
        sortCharArray(arrayChar); //сортируем массив char
        System.out.println(Arrays.toString(arrayChar)); //распечатываем массив char
    }

    public static char[] createCharArray(int n) {
        char[] output = new char[n];
        for (int i = 0; i < output.length; i++) {
            output[i] = getMyChar(70, 110);
        }
        return output;
    }

    public static char getMyChar(int min, int max) {
        return (char) (Math.random() * ((max - min) + 1) + min);
    }

    public static void sortCharArray(char[] array) {
        int count = 0;
        //char[] output = input;
        for (int i = 0; i < array.length - 1; i++) {
            char temp;
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            sortCharArray(array);
        }
    }
}
