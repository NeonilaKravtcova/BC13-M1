package lesson03;

import java.time.LocalDate;


public class HomeWork_Lesson03_Part_2 {
    public static void main(String[] args) {
        findEuroRate();
        findAreaRatio1();
        findAreaRatio2();
        findAnnualProfit();
    }

    public static void findEuroRate(){
        double min = 79.0;
        double max = 85.0;
        double dollarRate = Math.random() * ((max - min) + 1) + min;
        //double dollarRate = Math.random();
        System.out.println("Сегодня " + LocalDate.now());
        int a = 10000;
        int b = (int) (dollarRate * a);
        double dollarRateRound = (double) b / a;
        System.out.println("\n" + "Курс доллара на сегодня " + dollarRateRound + " руб.");

        double exchangeRate = 1.1;

        double euroRate = dollarRateRound / exchangeRate;
        int c = (int) (euroRate * a);
        double dollarEuroRound = (double) c / a;
        System.out.println("Курс евро на сегодня " + dollarEuroRound + " руб.");
        System.out.println("_________________________________");
    }

    public static void findAreaRatio1(){
        double squareBelorussia = 603628;
        double squareUkraine = 207600;
        double areaRatio1 = squareBelorussia / squareUkraine;
        System.out.println("Площадь Белоруссии - " + squareBelorussia + " км²");
        System.out.println("Площадь Украины - " + squareUkraine + " км²");
        System.out.println("\n" + "Отношение площади Белоруссии к площади Украины = " + String.format("%.2f", areaRatio1));
        System.out.println("_________________________________");

    }

    public static void findAreaRatio2(){
        double squareMoscow = 2561;
        double squareBerlin = 891;
        double areaRatio2 = squareMoscow / squareBerlin;
        System.out.println("Площадь Москвы - " + squareMoscow + " км²");
        System.out.println("Площадь Берлина - " + squareBerlin + " км²");
        System.out.println("\n" + "Площадь Москвы больше площади Берлина в " + String.format("%.2f", areaRatio2) +
                " раза");
        System.out.println("_________________________________");
    }

    public static void findAnnualProfit(){
        int investment = 1000;
        double annualRate = 0.035;
        System.out.println("Ваш взнос: " + investment + " Евро");
        System.out.println("Годовая ставка: " + String.format("%.1f", annualRate * 100) + "%");
        int years = 7;
        //double profit = investment * annualRate * 7;
        //System.out.println("Ваша прибыль через " + years + " лет: " + profit + " Евро");
        double summa = investment * (1 + annualRate * years);
        System.out.println("Сумма на вашем счёте через " + years + " лет: " + summa + " Евро");


    }
}

