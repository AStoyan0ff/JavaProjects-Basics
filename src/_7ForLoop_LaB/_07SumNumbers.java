package _7ForLoop_LaB;
import java.util.Scanner;

public class _07SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            result = result + curr;
        }
        System.out.println(result);
        scanner.close();
    }
}
