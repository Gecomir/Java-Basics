package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        //Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).
        switch (symbol) {
            case "+":
                int sum = n1 + n2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", n1, symbol, n2, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, symbol, n2, sum);
                }
                break;

            case "-":
                int subs = n1 - n2;
                if (subs % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", n1, symbol, n2, subs);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, symbol, n2, subs);
                }
                break;

            case "*":
                int multiplication = n1 * n2;
                if (multiplication % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", n1, symbol, n2, multiplication);
                } else {
                    System.out.printf("%d %s %d = %d - odd", n1, symbol, n2, multiplication);
                }
                break;

            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double division = ((n1 * 1.0) / n2);
                    System.out.printf("%d %s %d = %.2f", n1, symbol, n2, division);
                }
                break;

            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double remain = ((n1 * 1.0) % n2);
                    System.out.printf("%d %s %d = %.0f", n1, symbol, n2, remain);
                }
                break;
        }
    }
}
