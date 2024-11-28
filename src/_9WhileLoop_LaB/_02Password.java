package _9WhileLoop_LaB;
import java.util.Scanner;

public class _02Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(password)) {
            input = scanner.nextLine();
        }
        System.out.println("Welcome " + username + "!");
        scanner.close();
    }
}

