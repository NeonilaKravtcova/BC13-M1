package lesson15;

public class Password {
    public static void main(String[] args) {
        getCharTwo();
    }

/*    private static String getCharOne(){
        String input = "SDDFLKJDFBFLFBJFKASF;L";

    }*/

    private static String getCharTwo(){
        String input = "SDDFLKJDFBFLFBJFKASF;L";
        int min = 65;
        int max = 90;
        int result = (int) (Math.random() * ((max - min) + 1)) + min;
        char myChar = (char)result;
        String output = "" + myChar;
        if (Math.random() > 0.5){
            output = output.toUpperCase();
        } else {
            output = output.toLowerCase();
        }
        return output;

    }
}
