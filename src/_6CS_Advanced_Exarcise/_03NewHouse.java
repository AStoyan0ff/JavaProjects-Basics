package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _03NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerNumber = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5f;
        double priceDahlias = 3.8f;
        double priceTulips = 2.8f;
        double priceNarcissus = 3.0f;
        double priceGladiolus = 2.5f;

        double finalPrice = 0f;

        switch (flowerType){
            case "Roses":
                finalPrice = priceRoses * flowerNumber;
                if (flowerNumber > 80) {
                    finalPrice = finalPrice * 0.90;
                }
                break;
            case "Dahlias":
                finalPrice = priceDahlias * flowerNumber;
                if (flowerNumber > 90) {
                    finalPrice = finalPrice * 0.85;
                }
                break;
            case "Tulips":
                finalPrice = priceTulips * flowerNumber;
                if (flowerNumber > 80) {
                    finalPrice = finalPrice * 0.85;
                }
                break;
            case "Narcissus":
                finalPrice = priceNarcissus * flowerNumber;
                if (flowerNumber < 120) {
                    finalPrice = finalPrice * 1.15;
                }
                break;
            case "Gladiolus":
                finalPrice = priceGladiolus * flowerNumber;
                if (flowerNumber < 80) {
                    finalPrice = finalPrice * 1.20;
                }
                break;
        }
        double diff = Math.abs(budget - finalPrice);

        if (budget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNumber, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
        scanner.close();
    }
}
