package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _09TennisRanklist {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int tournamentsCount = Integer.parseInt(scanner.nextLine());
    int startPoints = Integer.parseInt(scanner.nextLine());

    int winPoints = 0;
    int wins = 0;

    for (int i = 1; i <= tournamentsCount; i++) {
        String rankToutnament = scanner.nextLine();

        switch (rankToutnament) {
            case "W" -> {
                winPoints += 2000;
                wins += 1;
            }
            case "F" -> winPoints += 1200;
            case "SF" -> winPoints += 720;
        }
    }
    int finalPoints = startPoints + winPoints;
    double avrgPoints = Math.floor(winPoints / tournamentsCount);
    double percent = 1.0 * wins / tournamentsCount * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %.0f%n", avrgPoints);
        System.out.printf("%.2f%%%n", percent);

        scanner.close();
    }
}
