package lesson02;

public class Cube {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Сторона куба: а = " + a + " см");
        System.out.println(" ");
        int s = squareCube(a);
        System.out.println("Площадь куба = " + s + " см.кв");
        int p = perimeterCube(a);
        System.out.println("Периметр куба = " + p + " см");

    }

    public static int squareCube(int a) {
        return 6 * a * a;
    }

    public static int perimeterCube(int a) {
        return 12 * a;
    }

}
