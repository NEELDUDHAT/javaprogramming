import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("enter first number:");

            int a = num.nextInt();
            System.out.println("enter second number:");
            int b = num.nextInt();

            int sum = a + b;

            // System.out.println("sum is " + (a + b));
            System.out.println("sum is " + sum);
        }

    }

}
