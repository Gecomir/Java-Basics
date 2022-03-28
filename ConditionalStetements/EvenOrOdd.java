import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //1. Прочитане от конзолата - цяло число
        //2. Проверка дали е четно или нечетно
        //3. Отпечатване, ако е четно -> "even"
                       // ако е нечетно -> "odd"
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0 ) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
    }
}
