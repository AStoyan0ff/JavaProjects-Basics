package _1FirstStepsInCoding_LaB;

import java.util.Scanner;

public class _09YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area = scanner.nextDouble();

        double pricePerSquareMeter = 7.61;

        double initialPrice = area * pricePerSquareMeter;

        double discount = initialPrice * 0.18;

        double finalPrice = initialPrice - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.%n", discount);

        scanner.close();
    }
}


