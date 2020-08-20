package lesson39;

public class MyLovelyMath {
    public static void main(String[] args) {
        //double PI = Math.PI; // финальная константа очень часто используется в java-script
        //PI = PI + 10;// мы не можем её поменять
        //Методы округления

        double pi = 2.5;
        double pi1 = Math.round(pi);
        double pi2 = Math.ceil(pi);
        double pi3 = Math.floor(pi);

        System.out.println(pi1);
        System.out.println(pi2);
        System.out.println(pi3);
    }
}
