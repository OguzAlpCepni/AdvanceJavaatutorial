import java.util.Scanner;

public class Main {
    static int jumpingOnClouds(int[] c) {
        int len = c.length;
        int count = -1;

        for (int i = 0; i < len; i++, count++) {
            if (i + 2 < len && c[i + 2] == 0) {
                i++;
            }
        }
        return count;
    }
    public static int jumpingOnCloudss(int[] c) {
        int jumps = 0;
        int i = 0;
        while (i < c.length - 1) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i += 2;
            } else {
                i += 1;
            }
            jumps += 1;
        }
        return jumps;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int ans = jumpingOnCloudss(c);
        System.out.println(ans);
        scanner.close();
    }
}