package _11NestedLoops_Lab;
import java.util.Scanner;

public class _04SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combination = 0;
        boolean found = false;

        for (int i = start; i <= end; i++) {
            for (int k = start; k <= end; k++) {
                combination++;

                if (i + k == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combination, i, k, magicNum);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.printf("%d combinations - neither equals %d%n", combination, magicNum);
        }
        scanner.close();
    }
}
