package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _04PersonalTitles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.next();

        if ("m".equals(gender)) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }

        } else if ("f".equals(gender)) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }
        scanner.close();
    }
}
