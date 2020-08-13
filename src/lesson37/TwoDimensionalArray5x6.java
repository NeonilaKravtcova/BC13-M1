package lesson37;

public class TwoDimensionalArray5x6 {
    public static void main(String[] args) {
        printRowArray(createArray(5, 6), 2);
    }

    public static int[][] createArray(int x, int y){
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    public static void printRowArray(int[][] a, int row){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[row][i] + " ");
        }
    }
}
