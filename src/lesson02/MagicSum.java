package lesson02;

public class MagicSum {
    public static void main(String[] args) {
        additionOne();
        additionTwo(5, 6);
        int sum = additionThree(4, 5);
        System.out.println(sum);
        int sum2 = additionFourth(7,8);
        System.out.println(sum2);
    }

    public static void additionOne() {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println(c);
    }

    public static void additionTwo(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static int additionThree(int x, int y) {
        int c = x + y;
        return c;
    }

    public static int additionFourth(int a, int b) {
        return a + b;
    }

}
