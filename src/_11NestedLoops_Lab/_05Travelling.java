package _11NestedLoops_Lab;
import java.util.Scanner;

public class _05Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String destination = scanner.nextLine();

            if (destination.equals("End")) {
                break;
            }

            double budget = Double.parseDouble(scanner.nextLine());
            double saveMoney = 0;

            while (saveMoney < budget) {
                double amount = Double.parseDouble(scanner.nextLine());
                saveMoney += amount;
            }
            System.out.printf("Going to %s!%n", destination);
        }
    scanner.close();
    }
}
