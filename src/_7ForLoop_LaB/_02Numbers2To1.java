package _7ForLoop_LaB;
import java.util.Scanner;

public class _02Numbers2To1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
