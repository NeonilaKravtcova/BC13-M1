package lesson10;

public class Safe {
    public static void main(String[] args) {
/*      System.out.println(smartDepositBox(true, false));
        System.out.println(smartDepositBox(false, true));
        System.out.println(smartDepositBox(false, false));*/

/*      System.out.println(smartDepositBox2(true, false));//false
        System.out.println(smartDepositBox2(false, true));//false
        System.out.println(smartDepositBox2(false, false));//false
        System.out.println(smartDepositBox2(true, true));//true*/

/*      System.out.println(bigBadaBoom(true, true));//true
        System.out.println(bigBadaBoom(false, false));//false
        System.out.println(bigBadaBoom(true, false));//false*/

/*        System.out.println(verySmartDepositBox(true, true, true));//true
        System.out.println(verySmartDepositBox(false, false, false));//false
        System.out.println(verySmartDepositBox(false, true, false));//false
        System.out.println(verySmartDepositBox(false, false, true));//false
        System.out.println(verySmartDepositBox(true, true, false));//true*/

        System.out.println(doorbell(true, true));
        System.out.println(doorbell(false, false));
        System.out.println(doorbell(true, false));
    }

/*    public static boolean verySmartDepositBox(boolean mamaPermission, boolean papaPermission, boolean omaPermission){
        return omaPermission || smartDepositBox2(boolean mamaPermission, boolean papaPermission);
                //mamaPermission || papaPermission && omaPermission;*/
    public static boolean doorbell(boolean door, boolean gate){
        return door ^ gate;
    }

    public static boolean smartDepositBox(boolean mamaFinger, boolean papaFinger){
        return mamaFinger || papaFinger;
    }

    public static boolean smartDepositBox2(boolean mamaFinger, boolean papaFinger){
        return mamaFinger && papaFinger;
    }

    public static boolean bigBadaBoom(boolean officer1, boolean officer2){
        return officer1 && officer2;
    }

}
