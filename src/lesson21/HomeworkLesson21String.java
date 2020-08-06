package lesson21;

public class HomeworkLesson21String {
    public static void main(String[] args) {
        System.out.println(hasBad("badxx")); // → true
        System.out.println(hasBad("xbadxx")); // → true
        System.out.println(hasBad("xxbadxx")); // → false
        System.out.println("\n");

        System.out.println(conCat("abc", "cat")); // → "abcat"
        System.out.println(conCat("dog", "cat")); // → "dogcat"
        System.out.println(conCat("abc", "")); // → "abc
        System.out.println("\n");

        System.out.println(frontAgain("edited"));// → true
        System.out.println(frontAgain("edit"));// → false
        System.out.println(frontAgain("ed"));// → true
    }

    public static boolean hasBad(String word) {
        String s = "bad";
        String wordCut1 = word.substring(0, 3);
        String wordCut2 = word.substring(1, 4);
        return s.equals(wordCut1) || s.equals(wordCut2);
    }

    private static String conCat(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != 0 && n2 != 0) {
            if (s1.substring(n1 - 1).equals(s2.substring(0, 1))) {
                s1 = s1.substring(0, n1 - 1);
            }
        }
        return s1.concat(s2);
    }

    private static boolean frontAgain(String s) {
        int n = s.length();
        if (n >= 2) {
            return s.substring(0, 2).equals(s.substring(n - 2, n));
        }
        return false;
    }
}
