import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        //1.Прочитане от конзолата - 1 ред (фигура)
        // квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му;
        // правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му;
        // кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга;
        //триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към
        //2. Изчисляване на лице на фигурите
        //3. Закръгляне до 3тия знак при отпечатване

        Scanner scanner = new Scanner(System.in);
        String figures = scanner.nextLine();
        double area = 0.0;

        if (figures.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;

        } else if (figures.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;

        } else if (figures.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * Math.pow(r, 2);

        } else if (figures.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
