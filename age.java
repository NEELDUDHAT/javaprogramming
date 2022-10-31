import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:");
        int age = sc.nextInt();
        if (age < 12) {
            System.out.println("you are a child");
        } else if (age >= 12 && age < 18) {
            System.out.println("you are a teenager");
        } else {
            System.out.println("you are an adult");
        }
        sc.close();
    }
}
