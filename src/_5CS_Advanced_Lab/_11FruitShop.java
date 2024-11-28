package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _11FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruits = scanner.nextLine();
        String day = scanner.nextLine();
        double cnt = Double.parseDouble(scanner.nextLine());

        boolean workingDays =
                day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday");

        boolean isWeekend = day.equals("Saturday")
                || day.equals("Sunday");
        boolean isValid = true;
        double price = 0;

        if (workingDays) {
            if (fruits.equals("banana")) {
                price = 2.50;
            } else if (fruits.equals("apple")) {
                price = 1.20;
            } else if (fruits.equals("orange")) {
                price = 0.85;
            } else if (fruits.equals("grapefruit")) {
                price = 1.45;
            } else if (fruits.equals("kiwi")) {
                price = 2.70;
            } else if (fruits.equals("pineapple")) {
                price = 5.50;
            } else if (fruits.equals("grapes")) {
                price = 3.85;
            } else {
                isValid = false;
           }


        } else if (isWeekend) {
            if (fruits.equals("banana")) {
                price = 2.70;
            } else if (fruits.equals("apple")) {
                price = 1.25;
            } else if (fruits.equals("orange")) {
                price = 0.90;
            } else if (fruits.equals("grapefruit")) {
                price = 1.60;
            } else if (fruits.equals("kiwi")) {
                price = 3.00;
            } else if (fruits.equals("pineapple")) {
                price = 5.60;
            } else if (fruits.equals("grapes")) {
                price = 4.20;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            double totalPrice = cnt * price;
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }

        scanner.close();
    }
}
