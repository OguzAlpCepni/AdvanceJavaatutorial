import java.util.Scanner;

public class Main {
    public static void CheckPlace(int age) throws InvalidAgeException {
        if(age<18) throw new InvalidAgeException("invalid age");
        else System.out.println("welcome place");
    }

    public static void main(String[] args)  throws InvalidAgeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age ");
        int age = scanner.nextInt();
        CheckPlace(age);

    }
}