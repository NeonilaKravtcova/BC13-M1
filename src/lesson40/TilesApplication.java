package lesson40;

public class TilesApplication {
    final static double MASTER_PRICE_PRO_METER = 27.0;
    public static void start(double rWidth, double rLength, double tilesPrice) {
        double tilesWidth = 20.0;
        double tilesLength = 30.0;
        double square = rLength * rWidth;

        int tilesWholeQty = getMyTilesWholeQty(rLength, rWidth, tilesLength, tilesWidth);
        int tilesQty = getMyTilesQty(rLength, rWidth, tilesLength, tilesWidth);
        double sumMaterialCost = getMyMaterialCost();
        double sumWorkingCost = getMyWorkPrice(square);
        double totalSum = sumMaterialCost + sumWorkingCost;
        int tilesBroken = tilesQty - tilesWholeQty;


        System.out.println("Программа расчёта стоимости плитки");
        System.out.println("для поверхности " + square + " м.кв.");
        System.out.println("Стоимость работы " + sumWorkingCost + " Euro");
        System.out.println("Стоимость материала " + sumMaterialCost + " Euro");
        System.out.println("Итоговая сумма " + totalSum + " Euro");
        System.out.println("Всего потребуется плиток - " + tilesQty);
        System.out.println("Из них поломанных - " + tilesBroken);
    }

    private static double getMyWorkPrice(double square) {
        return square * MASTER_PRICE_PRO_METER;
    }

    private static double getMyMaterialCost() {
        return 0;
    }

    private static int getMyTilesQty(double roomLength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength / 100;
        tilesWidth = tilesWidth / 100;
        int lineLength = (int) (Math.ceil(roomLength / tilesLength));
        int lineWidth = (int) (Math.ceil(roomWidth / tilesWidth));
        int result = lineLength * lineWidth;
        //int result = (int) (roomLength * roomWidth / tilesLength * tilesLength);
        return result;
    }

    private static int getMyTilesWholeQty(double roomLength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength / 100;
        tilesWidth = tilesWidth / 100;
        int tilesBrokenLength = (int) (Math.floor(roomLength / tilesLength));
        int tilesBrokenWidth = (int) (Math.floor(roomWidth / tilesWidth));
        int result = tilesBrokenLength * tilesBrokenWidth;
        return result;
    }
}
