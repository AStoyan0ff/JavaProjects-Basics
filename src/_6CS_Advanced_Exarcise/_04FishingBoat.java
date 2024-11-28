package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _04FishingBoat {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int budget = Integer.parseInt(scanner.nextLine());
       String season = scanner.nextLine();
       int fisherCount = Integer.parseInt(scanner.nextLine());
        double priceShip = getPriceShip(season, fisherCount);

        double diff = Math.abs(budget - priceShip);
       if (budget >= priceShip) {
           System.out.printf("Yes! You have %.2f leva left.", diff);
       } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
       }


    }

    private static double getPriceShip(String season, int fisherCount) {
        double priceShip = switch (season) {
            case "Spring" -> 3000f;
            case "Summer", "Autumn" -> 4200f;
            case "Winter" -> 2600f;
            default -> 0.0;
        };

        if (fisherCount <= 6) {
            priceShip = priceShip * 0.90;
        } else if (fisherCount > 7 && fisherCount <= 11) {
            priceShip = priceShip * 0.85;
        } else if (fisherCount > 12) {
            priceShip = priceShip * 0.75;
        }

        if (fisherCount % 2 == 0 && !(season.equals("Autumn"))) {
            priceShip = priceShip * 0.95;
        }
        return priceShip;
    }
}
