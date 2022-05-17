import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // число в диапазона [100…200] или е 0.
        // ако въведеното число не е валидно -> "invalid
        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = (number >= 100 && number <= 200) || number == 0;
        if (!isValid) {
            System.out.printf("invalid");
        }
    }
}
