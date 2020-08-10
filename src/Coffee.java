public class Coffee {
    private static void milk(int ml) {
        System.out.printf("%d of milk \n", ml);
    }

    private static void water(int ml) {
        System.out.printf("%d of water \n", ml);
    }

    private static void coffee(int mg) {
        System.out.printf("%d of coffee \n", mg);
    }

    public static void latte() {
        milk(48);
        water(100);
        coffee(20);
        System.out.println("Latte is ready");
    }

    public static void cappuccino() {
        milk(48);
        water(20);
        coffee(40);
        System.out.println("Cappuccino is ready");
    }

    public static void hotWater() {
        milk(0);
        water(100);
        coffee(0);
        System.out.println("Hot water is ready");
    }

    public static void americano() {
        milk(0);
        water(100);
        coffee(20);
        System.out.println("Americano is ready");
    }
}
