package _4ConditionalStatementsExercise;
import java.util.Scanner;

public class _06WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double records = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeters = Double.parseDouble(scanner.nextLine());

        double timeForSwim = distance * timePerMeters;
        double sectorInDistance = Math.floor(distance / 15);
        double slowTime = sectorInDistance * 12.5;

        timeForSwim = timeForSwim + slowTime;
        double diff = timeForSwim - records;

        if (timeForSwim < records) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeForSwim);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

        scanner.close();

    }
}
