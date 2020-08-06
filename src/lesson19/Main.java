package lesson19;

public class Main {
    /*    Реализовать метод печатающий таблицу умножения для заданного числа
    Пример: multiplicationTable(3)->
                3x1=3
                3x2=6
                ….
                3x10=30*/
    public static void main(String[] args) {
        multiplicationTable(3);
    }

    private static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (i * n));
        }
    }
}


