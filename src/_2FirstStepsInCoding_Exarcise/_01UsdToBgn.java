package _2FirstStepsInCoding_Exarcise;

import java.util.Scanner;

public class _01UsdToBgn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = 1.79549;

        double area = usd * bgn;

        System.out.printf(String.valueOf(area));

        scanner.close();
    }
}
