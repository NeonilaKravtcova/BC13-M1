package lesson19;

public class Homework19Rubls {
    public static void main(String[] args) {
        resultPrint(1, 30);
    }

    private static void resultPrint(int a, int b) {
        for (int i = a; i <= b; i++) {
            String currency = "рублей";
            if (i % 10 == 1 ^ i == 11) currency = "рубль";
            else if (i % 10 == 2 ^ i == 12 || i % 10 == 3 ^ i == 13 || i % 10 == 4 ^ i == 14)
                currency = "рубля";
            System.out.println(i + " " + currency);
        }
    }
/*    private static void resultPrint(int a, int b) {
        String word1 = "рубль";
        String word2 = "рубля";
        String word3 = "рублей";
        for (int i = a; i <= b; i++) {
            if (i % 10 == 1 ^ i == 11) {
                System.out.println(i + " " + word1);
            } else if (i % 10 == 2 ^ i == 12 || i % 10 == 3 ^ i == 13 || i % 10 == 4 ^ i == 14) {
                System.out.println(i + " " + word2);
            } else {
                System.out.println(i + " " + word3);
            }
        }
    }*/
}
