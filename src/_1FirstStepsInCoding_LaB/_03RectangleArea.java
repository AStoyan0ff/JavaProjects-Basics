package _1FirstStepsInCoding_LaB;

import java.util.Scanner;

public class _03RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int area = x * y;

        System.out.println(area);


    }
}
