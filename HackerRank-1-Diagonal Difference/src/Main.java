import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Matrix size");

        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of  the matrix ");
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        //calculate the left ot right diagonal
        int leftToRightSum = 0;
        for (int i = 0;i<n;i++){
            leftToRightSum += matrix[i][i];
        }
        //calculate the right to left diagonal
        int righToLeftSum = 0;
        for(int i = 0 ; i < n ; i++){
            righToLeftSum +=matrix[i][n - i - 1];
        }
        // calculate the absolute difference  between the two diagonals
        int absoluteDifference = Math.abs(leftToRightSum- righToLeftSum);
        System.out.println(absoluteDifference);
        input.close();
    }
}