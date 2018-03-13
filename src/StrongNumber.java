import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        int n, sum = 0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check prime or not: ");
        int num = sc.nextInt();
        temp = num;
        while (num != 0) {
            rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Number " + temp + " is a Strong number.");
        } else
            System.out.println("Number " + temp + " is not a Strong number.");
    }
}