import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        //1. Прочитане от конзолата - 3 реда
        //2. Изчисляваме
          //. Пилешко меню –  10.35 лв.
          //. Меню с риба – 12.40 лв.
          //. Вегетарианско меню  – 8.15 лв.
        //3. Отпечатване
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());
        double priceChickenMenu = chickenMenu * 10.35;
        double priceFishMenu = fishMenu * 12.40;
        double priceVegetarianMenu = vegetarianMenu * 8.15;
        double allMenu = priceChickenMenu + priceFishMenu + priceVegetarianMenu;
        double dessert = allMenu * 0.20;
        double finalPrice = allMenu + dessert + 2.50;
        System.out.println(finalPrice);
    }
}
