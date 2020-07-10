package lesson09;

public class TrueFalse {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        System.out.println(findTrue(a,b));

        int month = 8;
    }
    public static boolean findTrue(int firstVariable, int secondVariable){
        return firstVariable > 10 && firstVariable < 20 || secondVariable > 10 && secondVariable < 20;

    }

    public static String getStringMonth (int month){
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
        }
        return monthString;

    }
}
