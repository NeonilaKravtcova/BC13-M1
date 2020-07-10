package lesson08;

public class Baikonur {
    public static void main(String[] args) {

        double speedOne = 7.0;
        double speedTwo = 15.3;
        double speedThree = 10.0;

        spaceShuttle(speedOne);
        spaceShuttle(speedTwo);
        spaceShuttle(speedThree);
    }

    public static void spaceShuttle(double speed) {
        final double SUPERCONSTANT_G = 10.0;
        if (speed < SUPERCONSTANT_G){
            System.out.println("Ускорения недостаточно, чтобы взлететь");
        }
        else {
            System.out.println("Поехали!");
        }
    }
}
