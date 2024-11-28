package _4ConditionalStatementsExercise;

import java.util.Scanner;

public class _02BonusScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;

        if (num <= 100) {
            bonusPoints = 5;
        }
        else if (num <= 1000) {
            bonusPoints = num * 0.20;
        }
        else if (num > 1000) {
            bonusPoints = num * 0.10;
        }

        if (num % 2 == 0) {
            bonusPoints = bonusPoints += 1;

        }
        else if(num % 10 == 5) {
            bonusPoints = bonusPoints += 2;
        }

        System.out.println(bonusPoints);
        System.out.println(bonusPoints + num);

        scanner.close();
    }
}




