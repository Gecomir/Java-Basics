import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        //1. Четене на цяло число: оценка
        //2. Оценката дали е >= 5.00, отпечатване "Excellent!"
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        if (grade >= 5.00) {
            System.out.println("Excellent!");
        }
    }
}
