package lesson20;

public class HomeworkLesson20Weather {

    public static void main(String[] args) {
        cityWeather("Москва", "ВОСКРЕСЕНЬЕ");
    }

    private static void cityWeather(String city, String day) {
        int temperature;
        int dayNumber;
        String dayName = day.toLowerCase();
        switch (dayName) {
            case ("понедельник"):
                dayNumber = 1;
                dayName = "в понедельник";
                break;
            case ("вторник"):
                dayNumber = 2;
                dayName = "во вторник";
                break;
            case ("среда"):
                dayNumber = 3;
                dayName = "в среду";
                break;
            case ("четверг"):
                dayNumber = 4;
                dayName = "в четверг";
                break;
            case ("пятница"):
                dayNumber = 5;
                dayName = "в пятницу";
                break;
            case ("суббота"):
                dayNumber = 6;
                dayName = "в субботу";
                break;
            case ("воскресенье"):
                dayNumber = 7;
                dayName = "в воскресенье";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }

        switch (city) {
            case ("Берлин"):
                city = "Берлине";
                temperature = 20;
                break;
            case ("Лондон"):
                city = "Лондоне";
                temperature = 17;
                break;
            case ("Лиссабон"):
                city = "Лиссабоне";
                temperature = 25;
                break;
            case ("Париж"):
                city = "Париже";
                temperature = 23;
                break;
            case ("Москва"):
                city = "Москве";
                temperature = 19;
                break;
            case ("Минск"):
                city = "Минске";
                temperature = 18;
                break;
            case ("Саратов"):
                city = "Саратове";
                temperature = 15;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + city);
        }
        System.out.println("\n" + "Температура воздуха в " + city + " " + dayName + ": "
                + (temperature + dayNumber - 1) + " C°");
    }
}
