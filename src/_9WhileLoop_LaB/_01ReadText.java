package _9WhileLoop_LaB;
import java.util.Scanner;

public class _01ReadText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String idx = scanner.nextLine();

        while (!idx.equals("Stop")) {
            System.out.println(idx);
            idx = scanner.nextLine();
        }
        scanner.close();
    }
}
