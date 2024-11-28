package _1FirstStepsInCoding_LaB;

import java.util.Scanner;

public class _07ProjectCreation {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();
            int projectsCount = Integer.parseInt(scanner.nextLine());

            int neededTime = projectsCount * 3;

            System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                    name, neededTime, projectsCount);


        }


}
