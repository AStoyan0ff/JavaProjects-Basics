package _9WhileLoop_LaB;
import java.util.Scanner;

public class _03SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < number) {
            int crr = Integer.parseInt(scanner.nextLine());
            sum += crr;
        }
        System.out.println(sum);
        scanner.close();
    }
}
