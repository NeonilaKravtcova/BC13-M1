package lesson46;

public class Exercises_String02_19_getSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread", "bread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy", "bread"));// → "jam"
        System.out.println(getSandwich("xxbreadyy", "bread"));// → ""
        System.out.println(getSandwich("xxyy", "bread"));// → ""
    }

    public static String getSandwich(String input, String s) {
        String output = "It's not a sandwich!";
        int i1 = input.indexOf(s);
        int i2 = input.lastIndexOf(s);
        if (i1 != i2) {
            output = input.substring(i1 + s.length(), i2);
        }
        return output;
    }
}
