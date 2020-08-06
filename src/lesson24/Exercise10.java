package lesson24;

public class Exercise10 {
    public static void main(String[] args) {
/*        You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the
        sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more
        than either bc or ac sums, the result is 5. Otherwise the result is 0.*/
        System.out.println(blueTicket(9, 1, 0)); // → 10
        System.out.println(blueTicket(9, 2, 0)); // → 0
        System.out.println(blueTicket(6, 1, 4)); // → 10
        System.out.println(blueTicket(16, 3, 6)); // → 5
    }

    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (ab == 10 || ac == 10 || bc == 10) {
            return 10;
        } else if (a - c == 10 || b - c == 10) {  //ab - ac == 10 || ab - bc == 10
            return 5;
        } else return 0;
    }
}