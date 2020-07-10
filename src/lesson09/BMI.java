package lesson09;

public class BMI {
    public static void main(String[] args) {
        double bodyWeight = 100;
        double bodyHeight = 175;
        System.out.println(findBMI(bodyWeight, bodyHeight));
        double customerWeight1 = 70;
        double customerHeight1 = 163;
        System.out.println(findBMI(customerWeight1, customerHeight1));
    }

    public static double findBMI (double weight, double height){
        height /= 100;
        return weight / (height * height);
    }
}
