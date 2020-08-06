package lesson21;

import java.util.Scanner;

public class WhileScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Сколько тебе лет?  ");
        age = input.nextInt();
        while (age >= 18) {
            System.out.println("Ты можешь купить на вечер что-то более крепкое, чем чай");
            break;
        }
    }
}
