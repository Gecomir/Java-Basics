package WhileLoop;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int number = 0; number < n; number++) {
            int i = Integer.parseInt(scanner.nextLine());
            sum += i;
        }
        System.out.printf("%.2f%n", sum / n);
    }
}
