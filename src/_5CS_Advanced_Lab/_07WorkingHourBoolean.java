package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _07WorkingHourBoolean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.next();

        boolean isWorkingHours =  hours >= 10 && hours <= 18;
        boolean isWorkingDay =  day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday")
                || day.equals("Saturday");

        if (isWorkingHours && isWorkingDay) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
