package _2FirstStepsInCoding_Exarcise;

import java.util.Scanner;

public class _09FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int length = Integer.parseInt(scanner.nextLine());
            int width = Integer.parseInt(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double space = Double.parseDouble(scanner.nextLine());

            double volumeOfAquarium = length * width * height;
            double occupiedSpace = volumeOfAquarium / 1000f;

            double neededLiters = occupiedSpace * (1 - space / 100);

        System.out.println(neededLiters);

        scanner.close();


    }
}
