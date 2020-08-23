package lesson42;

import java.util.Arrays;

public class DoubleSort {
    public static void main(String[] args) {
        double[] array = createArrayDouble(10, 4);
        System.out.println(Arrays.toString(array));
        System.out.println();
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(double[] array){
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            sortArray(array);
        }
    }

    public static double myRound(double d, int n){
        int temp = (int) Math.pow(10, n);
        d = (double) ((int) (d * temp))/ temp;
        return d;
    }

    public static double[] createArrayDouble(int n, int decimalPlaces){
        double[] output = new double[n];
        for (int i = 0; i < n; i++) {
            output[i] = myRound(Math.random(), decimalPlaces);
        }
        return output;
    }
}
