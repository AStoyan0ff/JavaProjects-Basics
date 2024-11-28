package _6CS_Advanced_Exarcise;
import java.util.Scanner;

public class _01Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int allSeads = rows * columns;
        double income = 0.00;

        switch (movie) {
            case "Premiere" -> income = allSeads * 12f;
            case "Normal" -> income = allSeads * 7.50;
            case "Discount" -> income = allSeads * 5f;

        };

        System.out.println(String.format("%.2f leva", income));
        scanner.close();
    }
}
