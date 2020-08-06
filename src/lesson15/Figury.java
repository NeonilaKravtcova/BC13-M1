package lesson15;

public class Figury {
    public static void main(String[] args) {
        findRectangleSquare(3, 5);
        System.out.println(findRectangleSquareReturn(3, 5));
    }

    public static void findRectangleSquare(int a, int b){
        System.out.println("Площадь прямоугольника: " + a * b);
    }

    public static int findRectangleSquareReturn(int a, int b){
        return a * b;
    }
}
