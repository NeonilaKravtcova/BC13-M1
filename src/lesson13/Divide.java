package lesson13;

public class Divide {
    public static void main(String[] args) {
        findDigits();
        System.out.println();
        find7(100);
    }

    public static void find7(int n) {
        for (int i = 0; i < n; i += 7) {
            System.out.print(i + " ");
        }
    }



    public static void findDigits() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
