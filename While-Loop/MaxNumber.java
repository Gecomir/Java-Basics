import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            input = scanner.nextLine();
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
