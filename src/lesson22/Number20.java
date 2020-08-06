package lesson22;

public class Number20 {
    public static void main(String[] args) {
        /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
        See also: Introduction to Mod*/
        System.out.println(more20(20)); //→ false
        System.out.println(more20(21)); //→ true
        System.out.println(more20(22)); //→ true
        System.out.println(more20(40)); //→ false
        System.out.println(more20(41)); //→ true
    }

    private static boolean more20(int a){
        return a % 20 == 1 || a % 20 == 2;
    }
}
