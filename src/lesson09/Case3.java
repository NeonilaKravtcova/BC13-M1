package lesson09;

/**
 * Стоимость электроэнергии рассчитывается исходя из стоимости одного киловатт-часа в 20 центов. Базовая плата -
 * 30€. В базовую плату входят 100 киловатт-часов. Напишите метод расчёта стоимости пользования электроэнергией.
 */

public class Case3 {
    public static void main(String[] args) {
/*        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));*/
        //System.out.println(getPercent(1000.0, 10.0));//ожидаю 100
        System.out.println(findElectricityPrice(500));
    }

    public static double findElectricityPrice (double kvhCustomer){
        double result;
        double kvhPrice = 0.2;
        double basicKwh = 100;
        double basicKwhPrice = 30;

        result = basicKwhPrice + (kvhCustomer - basicKwh) * kvhPrice;
        if (result < 30){
            result = 30;
        }
        return result;
    }

/*    public static boolean nearHundred(int x) {
        int range = 10;
        return Math.abs(x - 100) <= range || Math.abs(x - 200) <= range;
    }

    public static double getPercent(double amount, double interest) {
        return amount / 100 * interest;
    }*/
}
