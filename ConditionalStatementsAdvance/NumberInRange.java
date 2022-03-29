import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // число  в интервала >= -100 И число <= 100 И число != 0 -> "Yes"
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= - 100 && number <= 100 && number !=0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
