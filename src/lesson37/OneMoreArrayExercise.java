package lesson37;

public class OneMoreArrayExercise {
    public static void main(String[] args) {
        int[][] myArray = new int[5][5];
        System.out.println("Сумма элементов массива: " + arraysSum(myArray));
    }

    private static int arraysSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.printf("%3d", array[i][j]);
                sum = sum + array[i][j];
            }
            System.out.println();
        }
        return sum;
    }
}
