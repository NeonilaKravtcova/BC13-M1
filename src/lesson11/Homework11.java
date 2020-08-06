package lesson11;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println(frontBack("code")); //"eodc"
        System.out.println(frontBack("a")); //"a"
        System.out.println(frontBack("ab")); //"ba"
        System.out.println();
        System.out.println(or35(3)); //true
        System.out.println(or35(10)); //true
        System.out.println(or35(8)); //false
    }

    public static String frontBack(String word) {
        int n = word.length();
        if (n > 1) {
            return word.substring(n - 1) + word.substring(1, n - 1) + word.substring(0, 1);
        } else {
            return word;
        }
    }

    public static boolean or35(int a) {
        return (a % 3 & a % 5) == 0;
    }
}
