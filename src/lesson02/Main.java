package lesson02;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет, Java!");
        System.out.println("{}[]''/<>=-||^^\\~");
        System.out.println("Я нашла все скобки и тильду!");
        welcome();
        addition();
        thankYou();
        goodbye();

    }

    public static void welcome() {
        System.out.println(" ");
        System.out.println("Добро пожаловать!");
    }

    public static void thankYou() {
        System.out.println("Спасибо за покупку!");
    }

    public static void addition() {
        int P1 = 3;
        int P2 = 8;
        String A1 = "Мандарины";
        String A2 = "Макароны";
        int A1q = 5;// вес мандаринов
        int A2q = 2;// количество пачек макарон
        int cash = 50;//получено кассиром
        String B1 = "кг";
        String B2 = "уп";
        String B3 = "Евро";
        System.out.println("Наши цены:");
        System.out.println(A1 + " стоят " + P1 + " " + B3 + "/" + B1);
        System.out.println(A2 + " стоят " + P2 + " " + B3 + "/" + B2);
        System.out.println(" ");
        System.out.println("Ваши покупки:");
        System.out.println(A1 + " -  " + A1q + " " + B1);
        System.out.println(A2 + " -  " + A2q + " " + B2);
        System.out.println(" ");
        System.out.println("К оплате:");
        System.out.println(A1q * P1 + A2q * P2);
        System.out.println(" ");
        System.out.println("Получено:");
        System.out.println(cash);
        System.out.println(" ");
        int total = A1q * P1 + A2q * P2;
        int rest = cash - total;
        System.out.println("Ваша сдача:");
        System.out.println(rest);
        System.out.println(" ");

    }

    public static void goodbye() {
        System.out.println("До " + "новых " + "встреч!");
    }
}
