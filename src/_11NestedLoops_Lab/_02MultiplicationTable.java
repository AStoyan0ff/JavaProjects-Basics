package _11NestedLoops_Lab;
import java.util.Scanner;

public class _02MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int n1 = 1; n1 <= 10;n1++) {
            for (int n2 = 1; n2 <= 10; n2++) {
                int result = n1 * n2;

                System.out.printf("%d * %d = %d%n", n1, n2, result);
            }
        }
        scanner.close();
    }
}
