package lesson33;

public class Review {
    public static void main(String[] args) {
        sum("Мои первые varargs",2, 3, 5, 19);
        citiesList("Berlin", "Munchen", "Dusseldorf", "Minsk");
        System.out.println(charToString('А', 'н', 'д', 'р', 'е', 'й'));
    }

    //Varargs - в аргументах всегда может быть только один и всегда идут последними
    private static void sum(String name, int... alldigits){
        int sum = 0;
        for (int i = 0; i < alldigits.length; i++) {
            sum += alldigits[i];
        }
        System.out.println(name + " " + sum);
    }

    public static void citiesList(String... cities){
        for (String element : cities) {
            System.out.println(element);
        }
    }

    public static String charToString(char... symbols){
        String output = "";
        for (int i = 0; i < symbols.length; i++) {
            output += symbols[i];
        }
        return output;
    }

}
