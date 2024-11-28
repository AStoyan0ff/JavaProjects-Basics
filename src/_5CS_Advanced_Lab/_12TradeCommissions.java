package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _12TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());

        boolean isValid = true;
        double commission = 0;

        switch (city) {
            case "Sofia" -> {
                if (income >= 0 && income <= 500) {
                    commission = income * 0.05;
                } else if (income > 500 && income <= 1000) {
                    commission = income * 0.07;
                } else if (income > 1000 && income <= 10000) {
                    commission = income * 0.08;
                } else if (income > 10000) {
                    commission = income * 0.12;
                } else {
                    isValid = false;
                }
            }
            case "Varna" -> {
                if (income >= 0 && income <= 500) {
                    commission = income * 0.045;
                } else if (income > 500 && income <= 1000) {
                    commission = income * 0.075;
                } else if (income > 1000 && income <= 10000) {
                    commission = income * 0.10;
                } else if (income > 10000) {
                    commission = income * 0.13;
                } else {
                    isValid = false;
                }
            }
            case "Plovdiv" -> {
                if (income >= 0 && income <= 500) {
                    commission = income * 0.055;
                } else if (income > 500 && income <= 1000) {
                    commission = income * 0.08;
                } else if (income > 1000 && income <= 10000) {
                    commission = income * 0.12;
                } else if (income > 10000) {
                    commission = income * 0.145;
                } else {
                    isValid = false;
                }
            }
            default -> isValid = false;
        }
        if (isValid) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }

        scanner.close();

    }
}
