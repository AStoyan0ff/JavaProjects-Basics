package _7ForLoop_LaB;
import  java.util.Scanner;

public class _08NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int minN = Integer.MAX_VALUE;
        int maxN = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            int curr = Integer.parseInt(scanner.nextLine());

            if (curr > maxN) {
                maxN = curr;
            }
            if (curr < minN) {
                minN = curr;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d",maxN, minN );
        scanner.close();
    }
}
