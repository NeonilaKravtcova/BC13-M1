package lesson31;

public class ArrayCharReview {
    public static void main(String[] args) {
        char[] myArray = new char[]{'a', 'b', '.', '@', 'g', 'f'};
        printArray(myArray);
        printArray(fillArrayRandomChar(myArray));
    }

    private static char[] fillArrayRandomChar(char[] ccc){
        for (int i = 0; i < ccc.length; i++) {
            ccc[i] = (char) (Math.random() * 200);
            System.out.print(Math.random() * 200 + " ");
            int myRandom = (int) (Math.random() * 200);
            System.out.println(myRandom);
        }
        return ccc;
    }

    public static void printArray(char[] ccc){
        System.out.println("Символьный массив длиной " + ccc.length + ": ");
        for (char c : ccc) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

}
