package lesson28;

public class Array {
    public static void main(String[] args) {
        germanCities();
    }

    public static void myFirstArray() {
        int[] myArray;
        String[] users;
        double[] gpsPoints;
        boolean[] permission;
        char[] cyrillicAlphabet;

    }

    public static void mySecondArray() {
        int[] myArray;
        String[] users;
        double[] gpsPoints;
        boolean[] truthTable;
        char[] cyrillicAlphabet;

    }

    public static void arrayFirstInitialisation() {
        String[] fourSeasons = new String[]{"Зима", "Vivaldi", "Чайковский", "Кинг", "Гостиница"};
        int[] numberFibonacci = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] capitalOfUssr = new String[]{"Москва", "Минск", "Киев", "Кишинёв", "Тбилиси"};
        char[] cyrillic = new char[]{'ж', 'л', 'ю', 'ч'};
        char[] cyrillic2 = new char[33];
        double[] time = new double[]{10.25, 15.45, 20.30};

    }

    public static void arraySecondInitialisation() {
        int[] field;
        field = new int[10]; //В массиве 10 ячеек, 10 - это его длина. Длина массива неизменна. Данные ячеек можно менять.
    }

    public static void germanCities() {
        String[] cities = new String[]
                {"Berlin", "München", "Dresden", "Hamburg", "Leipzig", "Bremen", "Frankfurt", "Köln"};
        int length = cities.length;
        int allLetter = 0;
        for (int i = 0; i < length; i++) {
            allLetter = allLetter + cities[i].length();
        }
        System.out.println(allLetter);
    }
}
