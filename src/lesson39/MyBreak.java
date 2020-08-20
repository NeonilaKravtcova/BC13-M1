package lesson39;

public class MyBreak {
    //Область видимости
    public static void main(String[] args) {
        boolean omaPermission = true;
        quarantineMethod(omaPermission);
    }

    private static void quarantineMethod(boolean quarantine) {
        //создание карантинной зоны
        quarantineZone:
        {
            if (quarantine) {
                System.out.println("Мы вышли из карантина");
                break quarantineZone; // выход из зоны карантина
            }
            System.out.println("Мы в карантине");
        }

    }
}
