package _9WhileLoop_LaB;
import java.util.Scanner;

public class _08Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double totalGrade = 0.0;
        int yaer = 1;
        int poorGrade = 0;

        while (yaer <= 12) {
            if (poorGrade > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                poorGrade++;
                continue;
            }
            totalGrade += grade;
            yaer++;
        }
        if (poorGrade < 1) {
            double avgrGrade = totalGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgrGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, yaer);
        }
        scanner.close();
    }
}
