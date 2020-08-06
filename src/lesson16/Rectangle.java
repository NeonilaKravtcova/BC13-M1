package lesson16;

public class Rectangle {
    public static void main(String[] args) {
        //rectangle(5, 7);
        //floydsTriangle(6);
        threeUnknonwn();
    }

    public static void threeUnknonwn(){
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36 ; y++) {
                for (int z = y; z <= 36 ; z++) {
                    if (x * y * z == 36){
                        System.out.print("x = " + x
                                            + "; y = " + y
                                            + "; z = " + z
                                            + "; ");
                        System.out.println();
                        System.out.println("xyz = " + x * y * z);
                    }
                }
                
            }
        }
    }
        


/*    public static void floydsTriangle(int n) {
        int digit = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(digit + " ");
                digit++;
            }

            System.out.println();
        }
    }*/

/*    public static void rectangle(int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                String symbol = "*";
                System.out.print(symbol);
            }
            System.out.println();
        }
    }*/
}
