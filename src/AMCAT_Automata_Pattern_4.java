import java.util.Scanner;

public class AMCAT_Automata_Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        printpat(a);
    }

    private static void printpat(int a) {
        int i, j = 1;
        for (int n = 1; n <= a; n++) {
            if (n % 2 != 0) {
                for (i = 1; i <= a; i++) {
                    System.out.print(n);
                }
                System.out.print(++j);
                System.out.println();
            } else {
                System.out.print(++j);
                for (i = 1; i <= a; i++) {
                    System.out.print(n);
                }
                System.out.println();
            }
        }
    }
}
