import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        //1. Четене от конзолата - 4 реда
        //2. Изчисляване
        // Пакет химикали - 5.80 лв.
        // Пакет маркери - 7.20 лв.
        // Препарат - 1.20 лв.
        // С/ка без отст. = пакет химикали * цената им , пакет маркери * цена им , препарат * цената му
        // Цялата сума с отст. = с/ка без отст. - (с/ка без отст * отстъпката)
        //3. Отпечатване на  цялата сума с отстъпката
        Scanner scanner = new Scanner(System.in);
        int penPackets = Integer.parseInt(scanner.nextLine());
        int markerPackets = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double totalWithoutDiscount = penPackets * 5.80 + markerPackets * 7.20 + cleaner * 1.20;
        double totalSum = totalWithoutDiscount - (discount * 1.0 / 100) * totalWithoutDiscount;
        System.out.println(totalSum);
        }
    }

