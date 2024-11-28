package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _08OnTimeForExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hoursEx = Integer.parseInt(scanner.nextLine());
        int minutesEx = Integer.parseInt(scanner.nextLine());
        int hoursArr = Integer.parseInt(scanner.nextLine());
        int minutesArr = Integer.parseInt(scanner.nextLine());

        int timeEx = (hoursEx * 60) + minutesEx;
        int timeArr = (hoursArr * 60) + minutesArr;

        int diff = Math.abs(timeArr - timeEx);
        if (timeArr > timeEx) {
            System.out.println("Late");

            if (diff >= 60) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (timeArr == timeEx || diff <= 30) {
            System.out.println("On Time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
        scanner.close();
    }
}

