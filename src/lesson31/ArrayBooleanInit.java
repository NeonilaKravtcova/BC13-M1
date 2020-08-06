package lesson31;

public class ArrayBooleanInit {
    public static void main(String[] args) {
        boolean[] b = new boolean[10];
        PrintArray(b);
        PrintArray(fillBooleanArray(b));
    }

    public static boolean[] fillBooleanArray(boolean[] b){
        for (int i = 0; i < b.length; i++) {
            b[i] = (Math.random() >= 0.5);
        }
        return b;
    }

    private static void PrintArray(boolean[] b){
        System.out.print("Массив логических значений длиной " + b.length + ": ");
        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println(b[b.length - 1] + ".");
    }
}
