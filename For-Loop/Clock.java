public class Clock {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            for (int minute = 0; minute <= 59; minute++)
                System.out.printf("%d : %d%n", i, minute);
            }
        }
    }