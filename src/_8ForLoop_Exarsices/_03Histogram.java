package _8ForLoop_Exarsices;
import java.util.Scanner;

public class _03Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        
        for (int i = 1; i <= N; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            
            if (curr < 200) {
                num1++;
            } else if (curr <= 399) {
                num2++;
            } else if (curr <= 599) {
                num3++;
            } else if (curr <= 799) {
                num4++;
            } else if (curr >= 800) {
                num5++;
            }
        }

        int result = num1 + num2 + num3 + num4 + num5;

        double percent1 = (1.0 * num1 / result) * 100;
        double percent2 = (1.0 * num2 / result) * 100;
        double percent3 = (1.0 * num3 / result) * 100;
        double percent4 = (1.0 * num4 / result) * 100;
        double percent5 = (1.0 * num5 / result) * 100;

        System.out.printf("%.2f%%%n", percent1);
        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%%n", percent4);
        System.out.printf("%.2f%%%n", percent5);

        scanner.close();
    }
}
