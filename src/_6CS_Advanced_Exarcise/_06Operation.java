package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _06Operation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        char operator = scanner.nextLine().charAt(0);

        if (operator == '+') {
            int sum = a + b;
            if (sum % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", a, operator, b, sum);
            } else {
                System.out.printf("%d %c %d = %d - odd", a, operator, b, sum);
            }
        } else if (operator == '-') {
            int sum = a - b;
            if (sum % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", a, operator, b, sum);
            } else {
                System.out.printf("%d %c %d = %d - odd", a, operator, b, sum);
            }
        } else if (operator == '*') {
            int sum = a * b;
            if (sum % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", a, operator, b, sum);
            } else {
                System.out.printf("%d %c %d = %d - odd", a, operator, b, sum);
            }
        } else if (operator == '/') {
            if (b <= 0) {
                System.out.printf("Cannot divide %d by zero", a);
            } else {
                double sum = (1.0 * a) / b;
                System.out.printf("%d %c %d = %.2f", a, operator, b, sum);
            }
        } else if (operator == '%') {
            if (b <= 0) {
                System.out.printf("Cannot divide %d by zero", a);
            } else {
                int sum = a % b;
                System.out.printf("%d %c %d = %d", a, operator, b, sum);
            }
        }
        scanner.close();
    }
}





