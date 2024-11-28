package _2FirstStepsInCoding_Exarcise;

import java.util.Scanner;

public class _07FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;

        double deliveryPrice = 2.50;
        double  desertDiscount = 0.20;

        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishCount = Integer.parseInt(scanner.nextLine());
        int vegetarianCount = Integer.parseInt(scanner.nextLine());

        double chickenPriceMenu = chickenCount * chickenMenu;
        double fishPriceMenu = fishCount * fishMenu;
        double vegetarianPriceMenu = vegetarianCount * vegetarianMenu;

        double totalMenuPrice = chickenPriceMenu + fishPriceMenu + vegetarianPriceMenu;
        double desertPrice = totalMenuPrice * desertDiscount;

        double finalPrice = totalMenuPrice + desertPrice + deliveryPrice;

        System.out.println(finalPrice);

        scanner.close();

    }
}
