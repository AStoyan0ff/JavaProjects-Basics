package _4ConditionalStatementsExercise;
import java.util.Scanner;

public class _08LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int time = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8f;
        double restTime = breakTime / 4f;

        double timeToWatch = breakTime - lunchTime - restTime;
        double diff = Math.ceil(Math.abs(timeToWatch - time));

        if (timeToWatch >= time) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, diff);
        }

        scanner.close();

    }
}
