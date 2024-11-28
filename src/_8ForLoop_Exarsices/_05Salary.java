package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _05Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int browserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= browserTabs; i++) {
            String socialNetwork = scanner.nextLine();

            switch (socialNetwork) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.printf("%d", salary);
        }

        scanner.close();
    }
}


