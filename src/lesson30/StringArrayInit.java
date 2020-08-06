package lesson30;

public class StringArrayInit {
    public static void main(String[] args) {
        String[] str = new String[10];
        ArrayStringPrint(str);
        ArrayStringPrint(createRandomArrayString(10));
        System.out.println(generateString(10));
    }


    public static String[] createRandomArrayString(int n) {
        String[] result = new String[n]; // {"asdjsakdfgnr"}
        for (int i = 0; i < result.length; i++) {
            result[i] = generateString(10).toLowerCase();
        }
        return result;
    }

    public static void ArrayStringPrint(String[] str) {
        System.out.println("Это стринговый массив длиной: " + str.length);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    public static String generateString(int n) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + randomLetter();
        }
        return result;
    }

    private static char randomLetter() {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return source.charAt((int) (Math.random() * source.length()));
    }
}
