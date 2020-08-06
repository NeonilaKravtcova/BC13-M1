package lesson12;

public class Homework12Part2 {
    public static void main(String[] args) {
        six();
    }

    public static void six() {
        for (int i = 10; i > 0; i--) {
            rowBegin(" ", i);
            rowEnd("*", i);
        }
    }

    public static void rowBegin(String symbol1, int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(symbol1);
        }
    }

     public static void rowEnd(String symbol2,int n) {
         for (int i = n; i < 11; i++) {
             System.out.print(symbol2);
         }
         System.out.println();
     }
}

