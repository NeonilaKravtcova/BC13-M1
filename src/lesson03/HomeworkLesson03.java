package lesson03;

public class HomeworkLesson03 {
    public static void main(String[] args) {

        findSquareCircle();

    }

    public static void findSquareCircle() {
        final double PI = 3.14;
        int max = 10;
        int randomRadius = (int) (Math.random() * max);
        System.out.println("\n" + "Радиус круга = " + randomRadius);
        double squareCircle = PI * Math.pow(randomRadius, 2);
        System.out.println("Площадь круга = " + squareCircle);
        double perimeterCirlce = 2 * PI * randomRadius;
        System.out.println("Длина окружности = " + perimeterCirlce);
    }

}

