package lesson45;

public class ExercisesString02_13 {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca"));// → "cat"
        System.out.println(oneTwo("tcagdo"));// → "catdog"
        System.out.println(oneTwo("telran!?"));// → "eltanr!?"
    }

    public static String oneTwo(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i += 3) {
            if (input.length() - i >= 3) {
                output = output + input.substring(i + 1, i + 3) + input.charAt(i);
            } else {
                output = output + input.substring(i);
            }
        }
        return output;
    }

}

/*        if (input.length() / 3 >= 1) {
            String temp = input;
            for (int i = 0; i < 2; i++) {
                input.replace(input.substring(i), input.substring(i + 1));
            }
            input.replace(input.substring(2), temp);
        }*/

