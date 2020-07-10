package lesson09;

public class StroyTrest12 {
    public static void main(String[] args) {

        System.out.println("Стоимость замены окон: " + findWindowsRepairPrice(2, 3, 2));
        System.out.println("Стоимость замены дверей: " + findDoorsRepairPrice(0.9, 2, 3));
        double total;
        total = findWindowsRepairPrice(2,3,2) +
                findDoorsRepairPrice(0.9,2,3);
        System.out.println("\n" + "ИТОГО: " + (total) + " Евро, включая НДС 16% - " + String.format("%.2f", total/116*16) + " Евро");
    }

    public static double findWindowsRepairPrice(double windowWidth, double windowHeight, int windowsQuantity) {
        double glassPrice = 100;
        double jambPrice = 100;
        double glassRepairPrice = windowWidth * windowHeight * glassPrice;
        double jambRepairPrice = (windowWidth + windowHeight) * 2 * jambPrice;
        return (glassRepairPrice + jambRepairPrice) * windowsQuantity;
    }

    public static double findDoorsRepairPrice(double doorWidth, double doorHeight, int doorsQuantity) {
        double doorPrice = 120;
        double jambPrice = 100;
        double glassRepairPrice = doorWidth * doorHeight * doorPrice;
        double jambRepairPrice = (doorWidth + doorHeight) * 2 * jambPrice;
        return (glassRepairPrice + jambRepairPrice) * doorsQuantity;
    }
}
