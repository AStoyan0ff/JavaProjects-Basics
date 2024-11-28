package _2FirstStepsInCoding_Exarcise;

import java.util.Scanner;

public class _06Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nylonSquareM = 1.50;
        double paintPerLiter = 14.50;
        double thinnerPerLiter = 5.00;
        double bags = 0.40;

        double discountPaint = 1.10;
        double discountNylon = 2.00;
        double discountPerHour = 0.30;

        int nylonQuantitySquirm = Integer.parseInt(scanner.nextLine());
        int paintQuantityLiters = Integer.parseInt(scanner.nextLine());
        int thinnerQuantityLiters = Integer.parseInt(scanner.nextLine());
        int workersHour = Integer.parseInt(scanner.nextLine());

        double nylonCost = (nylonQuantitySquirm + discountNylon) * nylonSquareM;
        double paintCost = (paintQuantityLiters * discountPaint) * paintPerLiter;
        double thinnerCost = thinnerQuantityLiters * thinnerPerLiter;

        double totalSum = nylonCost + paintCost + thinnerCost + bags;
        double workersSum = totalSum * discountPerHour * workersHour;

        double finalSum = totalSum + workersSum;

        System.out.printf("%.2f%n", finalSum);

        scanner.close();
    }
}
