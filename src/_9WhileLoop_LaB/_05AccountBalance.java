package _9WhileLoop_LaB;
import java.util.Scanner;

public class _05AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalBalance = 0.0;

        while (true) {
            String attempt = scanner.nextLine();

            if (attempt.equals("NoMoreMoney")) {
                break;
            }

            double amount = Double.parseDouble(attempt);

            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            totalBalance += amount;
            System.out.printf("Increase: %.2f%n",   amount);
        }

        System.out.printf("Total: %.2f%n", totalBalance);
        scanner.close();
    }
}
