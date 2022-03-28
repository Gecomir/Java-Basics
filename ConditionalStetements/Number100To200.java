import java.util.Scanner;

public class Number100To200 {
    public static void main(String[] args) {
        //1. Прочитане от конзолата - цяло число
        //2. Проверка - 3
        // под 100 отпечатайте: "Less than 100"
        // между 100 и 200 отпечатайте: "Between 100 and 200"
        // над 200 отпечатайте: "Greater than 200"
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }


    }
}
