package lesson28;

public class Main {
    public static void main(String[] args) {
        multiplicationsTable(10);
    }

    public static void multiplicationsTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(formatForMPTable(i, j));
            }
            System.out.println();
        }
    }

    public static String formatForMPTable(int i, int j) {
        String result;
        if (i * j < 10) result = "   " + i * j;
        else if (i * j < 100) result = "  " + i * j;
        else result = " " + i * j;
        return result;
    }
}
