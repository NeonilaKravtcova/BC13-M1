package lesson08;

public class HalloIF {
    public static void main(String[] args) {
        helloIfElse();
        int customer1 = 15;
        int customer2 = 17;
        int customer3 = 19;
        int customer4 = 30;
        alcoholPermission(customer1);
        alcoholPermission(customer2);
        alcoholPermission(customer3);
        alcoholPermission(customer4);

    }

    public static void alcoholPermission(int customerAge){
        if (customerAge < 16){
            System.out.println("Алкоголь не продавать");}
        else if (customerAge < 18){
            System.out.println("можно продать пиво");}
        else {
            System.out.println("Можно продать всё");
        }
    }

    public static void helloIfElse(){
        boolean permission = true;

        if (permission)
        {
            System.out.println("Я могу поехать в пионерский лагерь");
        }
        else {
            System.out.println("Я на всё лето останусь дома");
        }
    }
}
