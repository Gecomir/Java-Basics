import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        //1. Четене от конзолата - 2 цели числа
        //2. Отпечатване на по-голямото от 2те
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
