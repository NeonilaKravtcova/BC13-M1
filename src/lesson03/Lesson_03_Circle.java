package lesson03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lesson_03_Circle {
    public static void main(String[] args) {

        findSquareCircle();

    }

    public static void findSquareCircle() {
        final double PI = 3.14;
        int max = 10;
        int randomRadius = (int) (Math.random() * max);
        System.out.println("Радиус круга = " + randomRadius);
        double squareCircle = PI * Math.pow(randomRadius, 2);
        System.out.println("Площадь круга = " + squareCircle);
        double perimeterCirlce = 2 * PI * randomRadius;
        System.out.println("Длина окружности = " + perimeterCirlce);
    }
}
