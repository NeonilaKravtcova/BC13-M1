package lesson18;

public class HomeworkLesson18 {
    public static void main(String[] args) {
        System.out.println("Это треугольник по методу WHILE:");
        triangle("*", 10);
        System.out.println("\n");
        System.out.println("А это треугольник по методу DO WHILE:");
        triangle2("*", 10);
    }

    private static void triangle(String symbol, int n) {
        int a = 1;
        String line = "";
        while (a < n) {
            line = line + symbol;
            System.out.println(line);
            a++;
        }
    }

    private static void triangle2(String symbol, int n) {
        int a = 1;
        String line = "";
        do {
            line = line + symbol;
            System.out.println(line);
            a++;
        }
        while (a < n);
    }
}
