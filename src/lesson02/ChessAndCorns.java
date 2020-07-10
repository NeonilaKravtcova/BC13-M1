package lesson02;

public class ChessAndCorns {
    public static void main(String[] args) {
        layCorns();

    }

    public static void layCorns(){
        int a = 2;
        int b = 63;
        long c = (long)Math.pow(a, b);
        System.out.println(" ");
        System.out.println("На шахматной доске окажется 2^63 + 1 зерно, то есть: " + c + " + 2");
        System.out.println(" ");
        double d = c * 0.000035 + 2 * 0.000035;
        System.out.println("Одно зерно пшеницы весит 35 мг, таким образом мудрец получит:" + d + " кг зерна");


    }

}
