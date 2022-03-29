import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Monday, Tuesday, Wednesday, Thursday, Friday - "Working day"
        // Saturday, Sunday - "Weekend"
        // other - "Error"
        // серия от проверки на 1 ст/ст - switch
        String dayOfWeek = scanner.nextLine();
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
