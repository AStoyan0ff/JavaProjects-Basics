package _9WhileLoop_LaB;
import java.util.Scanner;

public class _06MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String atmpt = scanner.nextLine();
        int minN = Integer.MAX_VALUE;

        while (!atmpt.equals("Stop")) {
            int n = Integer.parseInt(atmpt);

            if (n < minN) {
                minN = n;
            }
        atmpt = scanner.next();
        }
        System.out.printf("%d", minN);
        scanner.close();
    }
}
