package _7ForLoop_LaB;
import java.util.Scanner;

public class _10OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        int evenResult = 0;
        int oddResult = 0;

        for (int i = 1; i <= N; i++) {
            int curr = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenResult = evenResult + curr;
            } else {
                oddResult = oddResult + curr;
            }
        }

        if (evenResult == oddResult) {
            System.out.printf("Yes%nSum = %d", evenResult);
        } else {
            int diff = Math.abs(evenResult - oddResult);

            System.out.printf("No%nDiff = %d", diff);
            scanner.close();
        }
    }
}
