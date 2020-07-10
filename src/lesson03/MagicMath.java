package lesson03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MagicMath {
    public static void main(String[] args) {
        double a = 3;
        double b = 7;
        double c = Math.pow(b, a);
        System.out.println("Возведение 7 в степень 3 = " + c);

        double magicPI = Math.PI;

        double myRandom = Math.random();
        System.out.println(myRandom);

        int min = 30;
        int max = 100;
        int result = (int) (Math.random() * ((max - min) + 1) + min);
        System.out.println("Ожидаю значение между 30 и 100 - " + result);

    }


}
