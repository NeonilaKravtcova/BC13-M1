package lesson18;

public class Homework18Part2 {
    // 1. Даны целые числа A и B, где B > 0. Вывести B раз число A.
    // 2. Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
    public static void main(String[] args) {
        exerciseOneWhile(5, 7);
        exerciseOneDoWhile(5, 10);
        exerciseTwoWhile(5, 17);
    }

    private static void exerciseOneWhile(int a, int b) {
        System.out.print("Задача 1 через WHILE: ");
        int n = 0;
        while (n < b) {
            System.out.print(a + " ");
            n++;
        }
        System.out.println("\n");
    }

    private static void exerciseOneDoWhile(int a, int b) {
        System.out.print("Задача 1 через DO WHILE: ");
        int n = 0;
        do {
            System.out.print(a + " ");
            n++;
        }
        while (n < b);
        System.out.println("\n");
    }

    private static void exerciseTwoWhile(int a, int b){
        System.out.print("Задача 2 через WHILE: ");
        while (a <= b){
            System.out.print(a + " ");
            a++;
        }
    }
}


