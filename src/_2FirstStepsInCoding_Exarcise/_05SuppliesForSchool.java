package _2FirstStepsInCoding_Exarcise;

import java.util.Scanner;

public class _05SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float penPacksPrice = 5.8f;
        float markersPacksPrice = 7.2f;
        float cleanerPerLiter = 1.2f;

        int packetCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int litersCleanerForDesk = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        float penPrice = packetCount * penPacksPrice;
        float markersPrice = markersCount * markersPacksPrice;
        float cleanerPrice = litersCleanerForDesk * cleanerPerLiter;

        float totalPrice = penPrice + markersPrice + cleanerPrice;
        float totalDiscount = (float) (totalPrice * (discount / 100.0));
        float neededMoney = totalPrice - totalDiscount;

        System.out.printf("%.2f%n", neededMoney);

        scanner.close();

    }
}
