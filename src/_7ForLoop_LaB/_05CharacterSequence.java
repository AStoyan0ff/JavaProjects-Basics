package _7ForLoop_LaB;
import java.util.Scanner;

public class _05CharacterSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();

        for (int i = 0; i < temp.length(); i++) {
            char symbol = temp.charAt(i);

            System.out.println(symbol);
        }   scanner.close();
    }
}

