import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        //1. Прочитаме от конзолата - текст
        //2. Проверка дали въведената парола е s3cr3t!P@ssw0rd -> "Welcome"
        // ako не е отпечатваме -> "Wrong password!"
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");

        } else {
            System.out.println("Wrong password!");
        }
    }
}
