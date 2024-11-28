package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _02HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int MAX = Integer.MIN_VALUE;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            result = result + curr;

            if (curr > MAX) {
                MAX = curr;
            }
        }
        int resultWithoutMax = result - MAX;

        if (MAX == resultWithoutMax) {
            System.out.printf("Yes%nSum = %d", MAX);
        } else {
            int diff = Math.abs(MAX - resultWithoutMax);
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}

