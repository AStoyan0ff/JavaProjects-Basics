package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _06Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=juryCount; i++) {
            String jury = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            academyPoints += jury.length() * points / 2;

            if (academyPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, academyPoints);
                break;
            }
        }
        if (academyPoints <= 1250.5) {
            double diff = 1250.5 - academyPoints;

            System.out.printf("Sorry, %s you need %.1f more!", name, diff);
        }
    }
}
