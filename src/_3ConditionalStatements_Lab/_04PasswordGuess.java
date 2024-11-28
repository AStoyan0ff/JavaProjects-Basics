package _3ConditionalStatements_Lab;

import java.util.Scanner;

public class _04PasswordGuess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       final String realPassword = "s3cr3t!P@ssw0rd";

        String setPassword = scanner.nextLine();

        if (setPassword.equals(realPassword)) {
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }

        scanner.close();
    }
}


