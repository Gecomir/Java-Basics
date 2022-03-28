import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        //1. прочитаме име от конзолата
        //2. отпечатваме "Hello, <name>!"
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + '!');
    }
}
