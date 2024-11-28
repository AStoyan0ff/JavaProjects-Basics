package _2FirstStepsInCoding_Exarcise;

import java.util.Scanner;

public class _03DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scanner.nextLine());

        int depositTerm = Integer.parseInt(scanner.nextLine());

        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double interestPerYear = depositAmount * (annualInterestRate / 100);
        double interestPerMonth = interestPerYear / 12;
        double finalAmount = depositAmount + depositTerm * interestPerMonth;

        System.out.println(finalAmount);

        scanner.close();
    }
}
