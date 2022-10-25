import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("Enter your lucky number:");

        try (Scanner sc = new Scanner(System.in)) {
            int num_1 = sc.nextInt();
            System.out.println("Enter your name:");

            String name = sc.next();
            // String name = sc.nextLine();

            System.out.println("Your lucky number is " + num_1);
            System.out.println("Your name is " + name);
        }
    }

}
