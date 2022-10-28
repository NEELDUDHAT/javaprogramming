import java.util.Scanner;

public class binarytodecimal {

    public static void main(String[] args) {
        int ans = 0, power = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of binary number:");
            int n = sc.nextInt();
            while (n > 0) {
                int paritynumber = n % 10;
                ans += paritynumber * power;
                power *= 2;
                n /= 10;
            }
        }
        System.out.println(ans);

    }
}
