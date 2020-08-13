package lesson37;

public class MyLovelyArrays {
    public static void main(String[] args) {

        myLovelyTwoDimentionalStringArray();

        }
    private static void myLovelyTwoDimentionalStringArray(){
        String[][] myStringArray = new String[5][3];
        myStringArray[0][0] = "1";
        myStringArray[0][1] = "Матвеев";
        myStringArray[0][2] = "№ 123";

        myStringArray[1][0] = "2";
        myStringArray[1][1] = "Петров";
        myStringArray[1][2] = "№ 355";

        myStringArray[2][0] = "3";
        myStringArray[2][1] = "Васечкин";
        myStringArray[2][2] = "№ 567";

        myStringArray[3][0] = "4";
        myStringArray[3][1] = "Герасимов";
        myStringArray[3][2] = "№ 678";

        myStringArray[4][0] = "5";
        myStringArray[4][1] = "Сидоров";
        myStringArray[4][2] = "№ 126";
        myPrintForStringArrayTwoD(myStringArray);
    }

    private static void myPrintForStringArrayTwoD(String[][] s){
        for (String[] strings : s) {
            for (String string : strings) {
                System.out.print(string + ", ");
            }
            System.out.println();
        }
    }

}
