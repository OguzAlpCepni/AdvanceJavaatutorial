import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of triangle row ");
        int rowNumber = scanner.nextInt();
        System.out.print(pascalTriangle.generate(rowNumber));
    }
}