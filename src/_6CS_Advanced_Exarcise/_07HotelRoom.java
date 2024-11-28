package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _07HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioCost = 0.0;
        double apartmentCost = 0.0;

        switch (month) {
            case "May", "October" -> {
                studioCost = 50.00 * nights;
                apartmentCost = 65.00 * nights;

                if (nights > 7 && nights <= 14) {
                    studioCost = studioCost * 0.95;
                } else if (nights > 14) {
                    studioCost = studioCost * 0.70;
                    apartmentCost = apartmentCost * 0.90;
                }
            }
            case "June", "September" -> {
                studioCost = 75.20 * nights;
                apartmentCost = 68.70 * nights;

                if (nights > 14) {
                    studioCost = studioCost * 0.80;
                    apartmentCost = apartmentCost * 0.90;
                }
            }
            case "July", "August" -> {
                studioCost = 76.00 * nights;
                apartmentCost = 77.00 * nights;

                if (nights > 14) {
                    apartmentCost = apartmentCost * 0.90;
                }
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentCost ,studioCost);
    }
}