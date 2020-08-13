package lesson35;

public class HW36_CharArray {
    public static void main(String[] args) {
        System.out.println(arrayCyrillic());
        System.out.println();
        System.out.println(cyrillicRandom(arrayCyrillic()));
    }

    public static char[] arrayCyrillic() {
        char[] cyrillicAlphabet = new char[33];
        int n = "А".charAt(0);
        for (int i = 0; i < 6; i++) {
            cyrillicAlphabet[i] = (char) (n);
            n++;
        }
        cyrillicAlphabet[6] = "Ё".charAt(0);
        for (int i = 7; i < 33; i++) {
            cyrillicAlphabet[i] = (char) (n);
            n++;
        }
        return cyrillicAlphabet;
    }

    public static char[] cyrillicRandom(char[] input) {
        char[] output = new char[input.length];
        int counter = 0;
        do {
            int n = (int) (Math.random() * input.length);
            if (input[n] != '*') {
                output[counter] = input[n];
                input[n] = '*';
                counter++;
            }
        }
        while (counter < input.length);
        return output;
    }
}
