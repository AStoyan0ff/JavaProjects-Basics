package _1FirstStepsInCoding_LaB;

import java.util.Scanner;

public class _08PetsFood {
    public static void main(String[] args) {

        final float DOG_PACKETS_PRICE = 2.50f;
        final float CAT_PACKETS_PRICE = 4.00f;

        Scanner scanner = new Scanner(System.in);
        float dogCountFood = scanner.nextFloat();
        float catCountFood = scanner.nextFloat();

        float totalCostDogFood = DOG_PACKETS_PRICE * dogCountFood;
        float totalCostCatFood = CAT_PACKETS_PRICE * catCountFood;

        float finalSum = totalCostDogFood + totalCostCatFood;

        System.out.printf("%.2f lv.%n", finalSum);

        scanner.close();
    }
}
