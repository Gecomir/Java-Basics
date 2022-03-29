import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        // 1 - Monday, 2 - Tuesday, ... 7 - Sunday, -1 - error
        // много проверки на ст/ста number
        switch (number) {
            case 1:
                System.out.printf("Monday");
                break;
            case 2:
                System.out.printf("Tuesday");
                break;
            case 3:
                System.out.printf("Wednesday");
                break;
            case 4:
                System.out.printf("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
