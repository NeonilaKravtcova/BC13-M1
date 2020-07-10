package lesson03;

public class HalloDouble {
    public static void main(String[] args) {
        goodEveningDouble();
        goodEveningFloat();
    }
    public static void goodEveningDouble(){
        double d0 = 10.0;
        double d1 = 1000.0;
        int i1 = 10;
        double divideTest = d0 / d1;

        System.out.println("Ожидаю получить переменную double d0 = 10 - " + d0);
        System.out.println("Ожидаю получить divideTest " + divideTest);
    }

    public static void goodEveningFloat(){
        float a = 3.5F;
        float b = 4.5f;
        float c = (float) 5.5;
        float d = a + b + c;
        System.out.println("a + b + c = " + d);
    }

    public static double findSquareCircle(){
        final double PI = 3.14;//final используется для финализации переменной
        // константы пишутся только большими буквами
        final double minTemp = 10.0;
        final double maxTemp = 24.0;

        double radius = 5.5;
        double square = PI * radius * radius;

        return square;



    }
}
