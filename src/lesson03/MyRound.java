package lesson03;

public class MyRound {
    public static void main(String[] args) {

        final double PI = Math.PI;//финализированные переменные пишем большими буквами

        double myNewPi = mySuperRound(6.123456);
        System.out.println("My new PI = " + myNewPi);

    }

    public static double mySuperRound(double digitsToRound){
        int temp1 = (int) (digitsToRound * 100);
        double temp2 = temp1;
        return temp2 / 100;
    }
}
