package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        myFirstInteger();
        myFirstLong();
        byteAddition();
        magic();
    }

    public static void myFirstInteger() {
        // здесь сейчас будет отличный код
        // definition, declaration, initialization
        // определение, объявление, инциализация переменных
        int a = 2; //присваиваем переменной а значение 2
        int b = 3;
        int c = a + b;
        System.out.println("Сумма а и b = " + c);

        int d;
        d = c * a;

    }

    public static void myFirstLong() {
        long myFirstLong = 12345678987654321L;
        long mySecondLong = 100;
        long myThirdLong = 9047239585621l;// пишем большую L в конце
        long myFourthLong = 12_345_678_987_654_321L;
        System.out.println(myFourthLong);


    }

    public static void byteAddition() {
        byte a = 100;
        byte b = 35;
        byte c = (byte) (a + b);
        System.out.println("Результат сложения а и b в байтах равен " + c);

    }

    public static void magic(){
        int hexValue = 0x100; // шестнадцатеричная система
        int binary = 0B1001___________1001; // двоичная система
        int octal = 0757; // восьмеричная система
    }
}
