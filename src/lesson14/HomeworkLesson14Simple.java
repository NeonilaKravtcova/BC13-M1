package lesson14;

public class HomeworkLesson14Simple {
    public static void main(String[] args) {
        // 1. Программа, которая находит чётные числа
        evenNumbers(0, 100);
        System.out.println("\n");
        // 2. Программа, которая находит нечётные числа
        oddNumbers(0, 100);
        System.out.println("\n");
        //Программа, которая находит високосный год, если мы знаем,
        // что любой год, которые делится на 4 без остатка - високосный.
        leapYear(2020, 2120);
        System.out.println();
        //leapYearReal(2020, 2120);
    }

    public static void evenNumbers(int a, int b) {
        System.out.println("Ряд чётных чисел в промежутке от " + a + " до " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void oddNumbers(int a, int b) {
        System.out.println("Ряд нечётных чисел в промежутке от " + a + " до " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void leapYear(int a, int b) {
        System.out.println("Високосные годы ближайшего столетия:");
        for (int i = a; i <= b; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*public static void leapYearReal(int a, int b) {
        System.out.println("Високосные годы в промежутке от " + a + " до " + b + ":");
        for (int i = a; i <= b; i++) {
            if ((i % 400 == 0) && (i % 4 == 0) ^ (i % 100 != 0)){
                }

            }
        }*/
    }