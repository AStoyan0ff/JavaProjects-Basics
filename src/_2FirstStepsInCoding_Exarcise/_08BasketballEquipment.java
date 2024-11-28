package _2FirstStepsInCoding_Exarcise;

import java.util.Scanner;

public class _08BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int taxPerYear = Integer.parseInt(scanner.nextLine());

        double shoesPrice = taxPerYear * 0.60;
        double outfitPrice = shoesPrice * 0.80;
        double basketBall = outfitPrice / 4;
        double accessories = basketBall / 5;

        double totalPrice = taxPerYear + shoesPrice + outfitPrice + basketBall + accessories;

        System.out.printf("%.2f%n", totalPrice);

        scanner.close();

    }
}
