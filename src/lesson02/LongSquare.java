package lesson02;

public class LongSquare {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Стороны прямоугольника: а = " + a + " см, b = " + b + " см.");
        System.out.println(" ");
        int s = squareRectangle(a, b);
        System.out.println("Площадь прямоугольника = " + s + " см.кв");
        int p = perimeterRectangle(a, b);
        System.out.println("Периметр прямоугольника = " + p + " см");

    }

    public static int squareRectangle(int a, int b) {
        return a * b;
    }

    public static int perimeterRectangle(int a, int b) {
        return 2 * (a + b);
    }

}
