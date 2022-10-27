import java.util.Scanner;

public class readcharacter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a character:");
            char ch = sc.next().charAt(0);
            System.out.println("character:" + ch);

        }

    }
}
