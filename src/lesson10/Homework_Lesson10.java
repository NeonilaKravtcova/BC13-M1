package lesson10;

public class Homework_Lesson10 {
    public static void main(String[] args) {
/*      System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));*/

        String newWord = everyNth("Miracle", 2);
        System.out.println(newWord);
        System.out.println(restWord("Miracle", 2));
        //System.out.println(everyNth("Miracle", 2)); //"Mrce"
        //System.out.println(everyNth("abcdefg", 2)); //"aceg"
        //System.out.println(everyNth("abcdefg", 3)); //"adg"


    }

    public static String everyNth(String word, int n) {
        int a = word.length();
        System.out.println(a);
        System.out.println(a / n);
        if ((a%n) < n) {
            String firstChar = word.substring(0, 1);
            String nextChar = word.substring(n, n + 1);
            return firstChar + nextChar;

        } else {
            return word;
        }

    }

    public static String restWord(String word, int n){
        return word.substring(n + 1);
    }
}
/*    public static boolean stringE(String hello){
        String cut = hello.substring(1, 2);
        System.out.println(cut);
        return false;*/
