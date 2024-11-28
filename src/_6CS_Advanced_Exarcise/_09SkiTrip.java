package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _09SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomsType = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = days - 1;
        double finalPrice = 0.0;

        switch (roomsType) {
            case "room for one person" -> finalPrice = nights * 18.00;
            case "apartment" -> {
                finalPrice = nights * 25.00;
                if (days < 10) {
                    finalPrice = finalPrice * 0.70;
                } else if (days >= 10 && days <= 15) {
                    finalPrice = finalPrice * 0.65;
                } else if (days > 15) {
                    finalPrice = finalPrice * 0.50;
                }
            }
            case "president apartment" -> {
                finalPrice = nights * 35.00;
                if (days < 10) {
                    finalPrice = finalPrice * 0.90;
                } else if (days >= 10 && days <= 15) {
                    finalPrice = finalPrice * 0.85;
                } else if (days > 15) {
                    finalPrice = finalPrice * 0.80;
                }
            }
        }
        if (grade.equals("positive")) {
            finalPrice = finalPrice * 1.25;
        } else if (grade.equals("negative")) {
            finalPrice = finalPrice * 0.90;
        }
        System.out.printf("%.2f", finalPrice);
    }
}