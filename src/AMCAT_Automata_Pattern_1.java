import java.util.Scanner;

public class AMCAT_Automata_Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int a = 1, b;
        for (int i = 1; i <= n; i++) {
            b = a + i;
            int count = 0;
            for (int j = 1; j <= i; j++, a++) {
                if (count==1){
                    System.out.print("*");
                }
                count=1;
                if (i%2==0){
                    System.out.print(--b);
                }
                else {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}
