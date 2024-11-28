package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _01NumbersEndingIn7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 7; i <= 1000; i+=10) {
            System.out.println(i);
        }
        scanner.close();
    }
}
