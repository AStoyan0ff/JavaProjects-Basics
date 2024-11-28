package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _05SmallShopCase_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double cnt = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0.0;

        switch (city) {
            case "Sofia" -> {
                switch (product) {
                    case "coffee" -> totalPrice = cnt * 0.50;
                    case "water" -> totalPrice = cnt * 0.80;
                    case "beer" -> totalPrice = cnt * 1.20;
                    case "sweets" -> totalPrice = cnt * 1.45;
                    case "peanuts" -> totalPrice = cnt * 1.60;

                }
            }
            case "Plovdiv" -> {
                switch (product) {
                    case "coffee" -> totalPrice = cnt * 0.40;
                    case "water" -> totalPrice = cnt * 0.70;
                    case "beer" -> totalPrice = cnt * 1.15;
                    case "sweets" -> totalPrice = cnt * 1.30;
                    case "peanuts" -> totalPrice = cnt * 1.50;

                }
            }
            case "Varna" -> {
                switch (product) {
                    case "coffee" -> totalPrice = cnt * 0.45;
                    case "water" -> totalPrice = cnt * 0.70;
                    case "beer" -> totalPrice = cnt * 1.10;
                    case "sweets" -> totalPrice = cnt * 1.35;
                    case "peanuts" -> totalPrice = cnt * 1.55;

                }
            }
        }
        System.out.println(totalPrice);
        scanner.close();
    }
}


