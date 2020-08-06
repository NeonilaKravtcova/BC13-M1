package lesson30;

public class ArrayCharInitAndPrint {
    public static void main(String[] args) {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        createAndPrintCharArray(input.length(), input);

    }


    public static void createAndPrintCharArray(int n, String s) {
        System.out.print("Символьный массив длиной " + n + " символов: ");
        char[] myCharArray = new char[n];
        for (int i = 0; i < myCharArray.length; i++) {
            myCharArray[i] = s.charAt(i);
            System.out.print(myCharArray[i] + " ");
        }
    }
}

