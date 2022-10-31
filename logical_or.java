import java.util.Scanner;

public class logical_or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num:");
        int n = sc.nextInt();
        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println(n + " is divisble by 3 or 5.");
        }
        sc.close();
    }

}
