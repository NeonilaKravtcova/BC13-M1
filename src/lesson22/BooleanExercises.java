package lesson22;

public class BooleanExercises {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); // false
        System.out.println(cigarParty(50, false)); // true
        System.out.println(cigarParty(70, true));  // true
        System.out.println(cigarParty(70, false));  // false

        System.out.println(caughtSpeeding(60, false)); // 0
        System.out.println(caughtSpeeding(65, false)); // 1
        System.out.println(caughtSpeeding(65, true)); // 0
        System.out.println(caughtSpeeding(85, true)); // 1
        System.out.println(caughtSpeeding(85, false)); // 2

    }

    private static boolean cigarParty(int cigars, boolean weekend) {
        return (cigars >= 40 && cigars <= 60) || (cigars > 60 && weekend);
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        if (speed <= 60) return 0;
        else if (speed <= 80) return 1;
        else return 2;
    }
}
