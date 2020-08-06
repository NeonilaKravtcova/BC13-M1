package lesson30;

public class ArrayPartTwo {
    public static void main(String[] args) {
        int[] a1 = new int[(int) (Math.random() * 100)];//массив с изменяющейся длиной
        System.out.println("Количество элементов массива а1: " + a1.length);//узнаем длину массива
        fillingArray(a1);
        System.out.println();
        myArrayPrint(arrayTryAndCry(10));
    }

    public static void fillingArray(int[] inputArray) {
/*        int sum = 0;
        for (int element : inputArray) {
            element = (int) (Math.random() * 100);
            System.out.print(element + " ");
            sum = sum + element;
        }*/
      for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
        //System.out.println("Среднее значение элементов массива по методу fillingArray: " + sum / inputArray.length);
        System.out.println("Среднее значение элементов массива по методу findAverage (for each): "
                + findAverage(inputArray));
        System.out.println("Среднее значение элементов массива по методу findAverage1 (for i): " +
                findAverage1(inputArray));
        //int max = findMax(inputArray);
        System.out.println("Минимальное значение элементов массива: " + findMin(inputArray));
        System.out.println("Максимальное значение элементов массива: " + findMax(inputArray));
    }

    public static int findAverage(int[] inputArray) {
        int sum = 0;
        for (int element : inputArray) {
            sum = sum + element;
        }
        return sum / inputArray.length;
    }

    public static int findAverage1(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        return sum / inputArray.length;
    }

    public static int findMin(int[] inputArray) {
        int min = inputArray[0];
        for (int j : inputArray) {
            if (min > j) min = j;
        }
        return min;
    }

    public static int findMax(int[] inputArray){
        int max = inputArray[0];
        for (int j : inputArray) {
            if (max < j) max = j;
        }
        return max;
    }

    public static int[] arrayTryAndCry(int n){
        int[] result= new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }

    public static void myArrayPrint(int[] inputArray){
        System.out.println("Вывод в печать массива arrayTryAndCry: ");
        for (int j : inputArray) {
            j = (int) (Math.random() * 100);
            System.out.print(j + " ");
        }
    }
}
