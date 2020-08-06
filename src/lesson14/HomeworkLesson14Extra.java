package lesson14;

public class HomeworkLesson14Extra {
    public static void main(String[] args) {
        //1. Программа, которая находит простые числа.
        primeNumbers(100);
    }

    public static void primeNumbers(int b) {
        //System.out.println(1 % 2);
        for (int i = 2; i <= b; i++) {
            double c = Math.sqrt(i);
            int m = (int) c;
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 ^ i == 2) {
                if ((c - (double) m) != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

    /*public static void primeNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            int n = 2;
            if ((i % n != 0) || (i == n)) {
                n = 3;
                if ((i % n != 0) || (i == n)) {
                    n = 5;
                    if ((i % n != 0) || (i == n)) {
                        n = 7;
                        if ((i % n != 0) || (i == n)) {
                            n = 11;
                            if ((i % n != 0) || (i == n)) {
                                System.out.print(i + " ");
                            }

                        }
                    }
                }
            }
        }
    }*/
