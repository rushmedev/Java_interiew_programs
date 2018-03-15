import java.util.Scanner;

public class AMCAT_Automata_Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of s:");
        int s = sc.nextInt();
        int t;
        if (s % 2 == 0) {
            t = 2 * s;
        } else
            t = (2 * s) - 1;
        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(s);
                }
                System.out.println();
                s = s + 1;
            } else {
                for (int k = n; k >= i - n; k--) {
                    System.out.print(t);
                }
                System.out.println();
                t = t - 1;
            }
        }
    }
}
