package lesson10;

public class Main {


    public static void main(String[] args) {
/*        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));*/

/*        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));*/
/*
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));*/

/*        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));*/

/*        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));*/

/*        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
        System.out.println(hasTeen(20, 20, 20));*/
/*
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));*/

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }

    public static int close10(int value1, int value2) {
        int difference1 = Math.abs(10 - value1);
        int difference2 = Math.abs(10 - value2);
        if (difference1 < difference2) {
            return value1;
        } else if (difference1 > difference2) {
            return value2;
        } else return 0;
    }

    public static boolean mixStart(String input) {
        String start = input.substring(1, 3);
        String etalon = "ix";
        return start.equals(etalon);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return c >= 13 & c <= 19 || a >= 13 & a <= 19 || b >= 13 & b <= 19;
    }

    public static boolean startHi(String input) {
        String hi = "hi";
        String start = input.substring(0, 2);
        return start.equals(hi);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static int diff21(int n) {
        int difference = Math.abs(21 - n);
        if (n < 21) {
            return difference;
        } else {
            return difference * 2;
        }
    }

    public static String missingChar(String s, int n) {
        return s.substring(0, n) + s.substring(n + 1);
    }

    public static String backAround(String str) {
        int lastIndex = str.length() - 1;
        String symbol = str.substring(lastIndex);//(str.length() - 1);
        return symbol + str + symbol;
    }
}