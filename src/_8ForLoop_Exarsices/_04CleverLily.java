package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _04CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int sellToys = Integer.parseInt(scanner.nextLine());

        int saveMoney = 0;
        int currMoney = 10;
        int toy = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                saveMoney += currMoney;
                currMoney += 10;
                saveMoney -= 1;
            } else {
                toy += 1;
            }
        }

        int moneyToys = toy * sellToys;
        int totalCost = moneyToys + saveMoney;
        double diff = Math.abs(totalCost - washMachinePrice);

        if (totalCost >= washMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
        scanner.close();
    }
}
