package lesson43;

public class Exercises_String_02_12 {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false
        int findChar = myIndexOf("AAxyzBB", 'd');
        System.out.println(findChar);
    }

    public static int myIndexOf(String s, char c){
        int index = 0;
        index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                index = i;
            }
        }
        return index;
    }

    public static boolean xyzMiddle(String s){
        int start = s.indexOf("x");
        int end = s.length() - s.indexOf("z") - 1;
        //System.out.println(start);
        //System.out.println(end);
        return Math.abs(start - end) <= 1;
    }
}
