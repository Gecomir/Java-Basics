package izpit;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = 5364;
        int heightEverest = 8848;
        int days = 1;

        String command = scanner.nextLine();
        while (!command.equals("END") && height < heightEverest && days <= 5) {
            if (command.equals("Yes")) {
                days++;
            }

            if (days > 5) {
                break;
            }

            height += Integer.parseInt(scanner.nextLine());

            if (height >= heightEverest) {
                break;
            }

            command = scanner.nextLine();
        }


        if (days <= 5 && height >= heightEverest) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.printf("Failed!%n");
            System.out.println(height);
        }
    }
}
