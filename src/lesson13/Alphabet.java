package lesson13;

public class Alphabet {
    public static void main(String[] args) {
        alphabet();
        System.out.println(reverse(12345)); //321
        total(123);
    }


    public static int total(int digit){
        int sum;
        int hundred = digit / 100;
        int ten = (digit - hundred * 100) / 10;
        int single = digit - hundred * 100 - ten * 10;
        sum = hundred + ten + single;
        return sum;
    }

    public static int reverse(int digit){
        int output = 0;
        String tempInput = String.valueOf(digit);
        String tempOutput = "";
        for (int i = tempInput.length() - 1; i >= 0; i--) {
            //tempOutput = tempOutput + tempInput.substring(i, i + 1);
            tempOutput = tempOutput + tempInput.charAt(i);
        }
        output = Integer.parseInt(tempOutput);
        return output;
    }

    public static void alphabet(){
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            String s = repeatSymbol(c, 10);
            System.out.println(s);
        }
    }

    public static String repeatSymbol(char c, int n){
        String output = "";
        for (int i = 0; i < n; i++) {
            output = output + c;
        }
        return output;
    }

}
