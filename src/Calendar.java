public class Calendar {
    public static void main(String[] args) {
        createMonth();
    }

    private static void createMonth() {
        int[][] monthCalender;
        monthCalender = new int[4][7];
        for (int i = 0; i < monthCalender.length; i++) {
            for (int j = 0; j < monthCalender[i].length; j++) {
                monthCalender[i][j] = i * 7 + j + 1;
                System.out.print(monthCalender[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Элемент по индексу 1, 3: " + monthCalender[1][3]);
    }
}
