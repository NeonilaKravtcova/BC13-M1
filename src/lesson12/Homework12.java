package lesson12;

public class Homework12 {
    public static void main(String[] args) {
        //first(5, 3);
        //second(5, 17);
        five("*", 10);
    }

/*    public static void first(int a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    public static void second(int a, int b) {
        for (int i = a; i <= b; i ++) {
            System.out.println(i);
        }
    }*/

    public static void five(String symbol, int n){
        String line = "";
        for (int i = 0; i < n; i++) {
            line = line + symbol;
            System.out.println(line);
        }
    }
}