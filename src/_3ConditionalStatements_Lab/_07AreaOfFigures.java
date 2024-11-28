package _3ConditionalStatements_Lab;

import java.util.Scanner;

public class _07AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();

       double result = 0;

        if (figureType.equals("square")) {

            double a = scanner.nextDouble();
            result = a * a;
        }
        else if (figureType.equals("rectangle")) {

            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            result = a * b;
        }
        else if (figureType.equals("circle")) {

            double radius = Double.parseDouble(scanner.nextLine());
            result = Math.PI * radius * radius;
        }
        else if (figureType.equals("triangle")) {

            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
            result = (a * ha) / 2;
        }


        System.out.printf("%.3f", result);

        scanner.close();
    }
}





