import java.util.Scanner;

public class Swap_two_numbers {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        //Logic for Swapping process
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping:");
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
