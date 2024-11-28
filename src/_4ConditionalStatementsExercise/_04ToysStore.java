package _4ConditionalStatementsExercise;

import java.util.Scanner;

public class _04ToysStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());

        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3.00;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double totalPrice =
                (puzzleCount * puzzlePrice) +
                (dollCount * dollPrice) +
                (bearCount * bearPrice) +
                (minionCount * minionPrice) +
                (truckCount * truckPrice);

        int totalToys =
                puzzleCount + dollCount +
                bearCount + minionCount +
                        truckCount;


        if (totalToys >= 50) {
            totalPrice *= 0.75;
        }

        totalPrice *= 0.90;

        if (totalPrice >= excursionPrice) {
            double moneyLeft = (totalPrice - excursionPrice);
            System.out.printf("Yes! %.2f lv left.%n", moneyLeft);
        }
        else {
            double moneyNeeded = (excursionPrice - totalPrice);
            System.out.printf("Not enough money! %.2f lv needed.%n", moneyNeeded);
        }

        scanner.close();
    }
}
