import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        //1. четене от конзолата на име, фамилия, възраст и град
        //2.отпечатване "You are <firstName> <lastName>, a <age>-years old person from <town>."
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
    }
}
