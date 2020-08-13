package lesson37;

public class PifagorTable {
    public static void main(String[] args) {
        createMT(10);
    }

    public static void createMT(int n) {
        int[][] multipleTable = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                multipleTable[i - 1][j - 1] = i * j;
                System.out.printf("%4d", multipleTable[i - 1][j - 1]);
            }
            System.out.println();
        }
    }
}
