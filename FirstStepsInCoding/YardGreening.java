import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        //1.Прочитане от конзолата - кв.м
        //2.Изчисляване 550 кв.м * 7.61лв. = 4185.50лв.
        //3.Приспадане на отстъпка 18% (0.18) от цялата сума 4185.50лв. = 753.39лв.
        //4.Сумираме цялата сума 4185.5лв. - 753.39лв. = 3432.11лв.
        //5.Отпечатване 2 реда: "The final price is: " , "The discount  is: "
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double price = area * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.printf("The discount is: " + discount + " lv.");
    }
}
