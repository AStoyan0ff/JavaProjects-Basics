package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _02WeekendOrWorkingDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String days = scanner.nextLine();

        switch (days) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                    -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");

            default -> System.out.println("Error");
        }
        scanner.close();
    }
}
