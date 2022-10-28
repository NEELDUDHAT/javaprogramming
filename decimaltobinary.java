import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        int ans = 0, power = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of decimal number:");
            int n = sc.nextInt();
            while (n > 0) {
                int lastdigit = n % 2;
                ans += lastdigit * power;
                power *= 10;
                n = n / 2;
            }
        }
        System.out.println(ans);

    }
}
