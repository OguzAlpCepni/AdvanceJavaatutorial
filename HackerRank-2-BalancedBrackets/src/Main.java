import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/balanced-brackets/problem
        Scanner scanner = new Scanner(System.in);
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        System.out.println(" number of try33");
        int n = scanner.nextInt();
        System.out.println("1");
        for( int i = 0; i <n;i++){
            String s = scanner.next();
            System.out.println(balancedBrackets.isBalanced(s));
        }
        scanner.close();
    }

}