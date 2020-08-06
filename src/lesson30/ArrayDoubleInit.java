package lesson30;

public class ArrayDoubleInit {
    public static void main(String[] args) {
        double[] doubleArray01 = new double[10];
        ArrayDoublePrint(doubleArray01);
        double[] doubleArray02 = fillMyDoubleArray(doubleArray01);
        ArrayDoublePrint(doubleArray02);
        System.out.println(myRound(0.6256378));
    }

    public static double myRound(double d){
        int temp = (int) (d * 100);
        double temp2 = temp;
        return (double) temp2 / 100;
    }

    public static double[] fillMyDoubleArray(double[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRound(Math.random());
        }
        return myArray;
    }

    public static void ArrayDoublePrint(double[] input){
        System.out.println("Массив дробей длиной " + input.length);
        for (double d : input) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
