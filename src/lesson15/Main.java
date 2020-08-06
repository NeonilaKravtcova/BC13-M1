package lesson15;

public class Main {
    public static void main(String[] args) {
        System.out.println(perimeterRectangle(5, 7));
        System.out.println(squareArea(5));
        System.out.println(squarePerimeter(3));
        System.out.println(perimeterCircle(5));
        System.out.println(squareCircle(5));
        exercise3(35, 87);
    }

    public static int perimeterRectangle(int a, int b) {
        return 2 * (a + b);
    }

    public static int squareArea(int a) {
        return a * a;
    }

    public static int squarePerimeter(int a) {
        return 4 * a;
    }

    public static double perimeterCircle(int radius) {
        return 2 * radius * Math.PI;
    }

    public static double squareCircle(int radius) {
        return Math.PI * radius * radius;
    }

    public static void exercise3(int a, int b){
        for (int i = a; i < b; i++) {
            if (i % 7 == 0 || i % 7 == 2 || i % 5 == 0){
                System.out.println(i);
            }
        }
    }

}
