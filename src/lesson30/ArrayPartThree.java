package lesson30;

public class ArrayPartThree {
    public static void main(String[] args) {
        int[] var1 = new int[10]; //1-ый способ инициализации массива
        int[] var2 = new int[] {1, 5, 18}; //2-ой способ
        int[] var3 = var2; //3-ий способ
        int[] var4 = createAnArray(10); //4-ый способ - через метод, который возвращает целочисленный массив
        ArrayPartTwo.myArrayPrint(var4);
    }

    private static int[] createAnArray(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
