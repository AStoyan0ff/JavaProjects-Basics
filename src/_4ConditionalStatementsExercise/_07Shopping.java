package _4ConditionalStatementsExercise;
import java.util.Scanner;

public class _07Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double videocardPrice = 250;
        double processorPrice = (videocardPrice * 0.35);
        double ramPrice = (videocardPrice * 0.10);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocardCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videocardSum = videocardCount * videocardPrice;
        double processorSum = processorsCount * (videocardSum * 0.35);
        double ramSum = ramCount * (videocardSum * 0.10);

        double totalSum = videocardSum + processorSum + ramSum;

        if (videocardCount > processorsCount) {
            totalSum = totalSum * 0.85;
        }

        double diff = Math.abs(totalSum - budget);

        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

        scanner.close();
    }
}
