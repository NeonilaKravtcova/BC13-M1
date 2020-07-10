package lesson02;

public class HelloEvening {
    public static void main(String[] args) {
        int a = 5;
        findSquare(a);
        findPerimeter();
    }
    public static void findSquare(int a){
        int square = a * a;
        System.out.println(square);
    }

    public static void findPerimeter(){
        int a = 5;
        int perimeter = 4 * a;
        System.out.println(perimeter);
    }
}
