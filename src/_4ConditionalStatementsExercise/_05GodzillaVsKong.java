package _4ConditionalStatementsExercise;
import java.util.Scanner;

public class _05GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int mutesCounts = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());;

        double decorPrice = budget * 0.10;
        double peopleCountPrice = mutesCounts * clothingPrice;

        if (mutesCounts > 150) {
            peopleCountPrice = peopleCountPrice * 0.90;
        }

        double totalPrice = decorPrice + peopleCountPrice;
        double diff = Math.abs(totalPrice - budget);

        if (totalPrice <= budget) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", diff);
        }
        else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", diff);
        }

        scanner.close();
    }
}
