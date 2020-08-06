package lesson24;

public class Exercise09 {
    public static void main(String[] args) {
/*        Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of
        dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod*/
        System.out.println(nearTen(12)); // → true
        System.out.println(nearTen(17)); // → false
        System.out.println(nearTen(19)); // → true

/*        We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or
        2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the
        amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always
        bad (0).*/
        System.out.println(teaParty(6, 8)); // → 1
        System.out.println(teaParty(3, 8)); // → 0
        System.out.println(teaParty(20, 6)); // → 2

/*        Given three ints, a b c, return true if it is possible to add two of the ints to get the third.*/
        System.out.println(twoAsOne(1, 2, 3)); // → true
        System.out.println(twoAsOne(3, 1, 2)); // → true
        System.out.println(twoAsOne(3, 2, 2)); // → false

/*        Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note:
        the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.*/
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
    }

    private static boolean lastDigit(int a, int b, int c){
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    private static boolean twoAsOne (int a, int b, int c){
        return a + b == c || a + c == b || b + c == a;
    }

    private static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        }
        return 1;
    }

    private static boolean nearTen(int num){
        return num % 10 <= 2 || num % 10 >= 8;
    }
}
