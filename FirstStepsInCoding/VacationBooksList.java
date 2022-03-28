import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        //1. Четене от конзолата - 3 реда
        //2. Изчисляване
         // изчисляваме общото време за четене на книгата: 212 / 20 = 10 часа
         // получения резултат делим на броя дни, за да получим необходимите часове на ден: 10часа / 2 дни = 5часа на ден
        //3. Отпечатване броят часове за четене, които трябва да отделя за 1 ден.

        Scanner scanner = new Scanner(System.in);
        int pageNumbers = Integer.parseInt(scanner.nextLine());
        int page = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int timeToRead= pageNumbers / page;
        int hourPerDay= timeToRead/ days;
        System.out.println(hourPerDay);




    }
}
