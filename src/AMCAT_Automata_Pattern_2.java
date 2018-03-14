import java.util.Scanner;

public class AMCAT_Automata_Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int c = 1;
        int l, m;
        m = n / 2;
        if (n % 2 == 0) {
            l = n + 1;
        } else {
            l = n;
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < l; j++) {
                if (i > 0 && m == j) {
                    System.out.print(" "+c);
                    c++;
                } else {
                    System.out.print(" " + n);
                }
            }
            System.out.println();
        }
    }
}
