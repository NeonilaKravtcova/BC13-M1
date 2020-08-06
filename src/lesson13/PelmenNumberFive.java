package lesson13;

public class PelmenNumberFive {
    public static void main(String[] args) {
        happyDumplings();
    }

    public static void happyDumplings() {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                System.out.println("Вот счастливый пельмень!");
                break;
            }
        }
    }


}
