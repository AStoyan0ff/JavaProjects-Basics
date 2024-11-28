package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _07TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numGroup = Integer.parseInt(scanner.nextLine());
        int peopleCount = 0;

        int musalaPeak = 0;
        int monblanPeak = 0;
        int kilimandjaroPeak = 0;
        int k2Peak = 0;
        int everestPeak = 0;

        for (int i = 1; i <= numGroup; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            peopleCount += peopleInGroup;

            if (peopleInGroup <= 5 ) {
                musalaPeak += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblanPeak += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandjaroPeak += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2Peak += peopleInGroup;
            } else if (peopleInGroup >= 41) {
                everestPeak += peopleInGroup;
            }
        }

        System.out.printf("%.2f%%%n", (1.0 * musalaPeak / peopleCount) * 100 );
        System.out.printf("%.2f%%%n", (1.0 * monblanPeak / peopleCount) * 100 );
        System.out.printf("%.2f%%%n", (1.0 * kilimandjaroPeak / peopleCount) * 100 );
        System.out.printf("%.2f%%%n", (1.0 * k2Peak / peopleCount) * 100 );
        System.out.printf("%.2f%%%n", (1.0 * everestPeak / peopleCount) * 100 );

        scanner.close();
    }

}
