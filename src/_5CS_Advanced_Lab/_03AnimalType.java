package _5CS_Advanced_Lab;
import java.util.Scanner;

public class _03AnimalType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String animals = scanner.next();

        switch (animals) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;

        }

        scanner.close();
    }
}
