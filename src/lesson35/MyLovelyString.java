package lesson35;

public class MyLovelyString {
    public static void main(String[] args) {
        myString();
        //String
        //StringBuffer - делают то же, что и String
        //StringBuilder

        //1. String - это неизменяемый литерал, например - имя пользователя,
        //2. А StringBuffer и StringBuilder - изменяемый стринг, например, пароль
        //3. StringBuffer - синхронизированный тип буфера, потокобезопасный или многопоточный
        //4. StringBuilder - однопоточный или непотокобезопасный
    }

    private static void myString(){
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            pass.append(" ").append(i);//append - это знак конкатинации
            //pass = pass + i;
        }
        System.out.println(pass);
    }
}
