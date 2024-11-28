package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _08CinemaTicket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String days = scanner.nextLine();

        switch (days) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(16);
                break;
        }
        scanner.close();
    }
}
