package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _10InvalidNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isInvalid = (n >= 100 && n <= 200) || (n == 0);

        if (!isInvalid) {
            System.out.println("invalid");
        }

        scanner.close();

    }
}
