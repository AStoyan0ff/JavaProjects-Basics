package _7ForLoop_LaB;
import java.util.Scanner;

public class _09LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= number * 2; i++) {
            int curr = Integer.parseInt(scanner.nextLine());

            if (i <= number) {
                leftSum = leftSum + curr;
            } else {
                rightSum = rightSum + curr;
            }
        }

        int diff = Math.abs(leftSum - rightSum);

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", diff);
            scanner.close();
        }
    }
}