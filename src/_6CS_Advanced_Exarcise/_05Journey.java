package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _05Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination ="";
        String place ="";

        double usedMoney = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                usedMoney = budget * 0.30;
            } else if (season.equals("winter")) {
                place = "Hotel";
                usedMoney = budget * 0.70;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                usedMoney = budget * 0.40;
            } else if (season.equals("winter")) {
                place = "Hotel";
                usedMoney = budget * 0.80;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            if (season.equals("summer")) {
                place = "Hotel";
                usedMoney = budget * 0.90;
            } else if (season.equals("winter")) {
                place = "Hotel";
                usedMoney = budget * 0.90;
            }
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, place, usedMoney);
        scanner.close();
    }
}
