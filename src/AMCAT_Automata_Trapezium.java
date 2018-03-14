public class AMCAT_Automata_Trapezium {
    public static void main(String[] args) {
        int a = 0, b = 0, n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(++a + "*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(++b + i * i);
                if (l != i) {
                    System.out.print("*");
                } else {
                    System.out.println("");
                }
            }
            for (int m=i;m<=n;m++) {
                System.out.print(" ");
            }
        }
    }
}
