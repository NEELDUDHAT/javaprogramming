import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("enter the value of p:");
            float p = sc.nextFloat();
            System.out.println("enter the value of r:");
            float r = sc.nextFloat();
            System.out.println("enter the value of n:");
            float n = sc.nextFloat();

            System.out.println("principle:" + p);
            System.out.println("rate:" + r);
            System.out.println("number of year:" + n);

            float si = (p * r * n) / 100;
            System.out.println("simple interest is " + si);

        }

    }
}
