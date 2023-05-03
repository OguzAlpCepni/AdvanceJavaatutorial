import java.util.Scanner;

public class Main {
    public static void PlaceController(int age){
        if(age<18) throw new ArithmeticException();
        else System.out.println("welcome to place");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how old are you");
        int age = scanner.nextInt();

        try{
            PlaceController(age);
        }
        catch (ArithmeticException e){
            System.out.println("if you are 18 you not entered place");
        }

    }
}