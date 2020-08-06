package lesson12;

public class HelloTwelve {
    public static void main(String[] args) {
        repeat(5);
    }

    public static void repeat(int weekDays) {
        for (int i = 1; i <= weekDays; i++) {
            System.out.println(i + ". Я хочу повторить эту строку " + weekDays + " раз");
        }

        for (int i = weekDays; i > 0; i--);
    }
}
