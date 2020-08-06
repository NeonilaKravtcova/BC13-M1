package lesson22;

public class HomeworkLesson22Caesar {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        // -> "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
    }

    private static void enigmaCaesar(String text){
        int n = text.length();
        for (int i = 0; i < n - 1; i++) {
            char c = text.charAt(i);
            int code = (int)c;
            char newChar = (char)(code * 10);
            System.out.print(newChar);
        }
    }
}
