import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not:");
        int number = sc.nextInt();
        if(number != 0) {
            System.out.println("The number " + number + " is " + PrimeCheck(number));
        }
    }

    public static String PrimeCheck(int num) {
        if (num < 0) {
            return "not valid";
        }
        if (num == 0 || num == 1) {
            return "not prime";
        }
        if (num == 2 || num == 3) {
            return "prime number";
        }
        if ((num * num - 1) % 24 == 0) {
            return "prime";
        } else {
            return "not prime";
        }
    }

}
