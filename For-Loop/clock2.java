public class clock2 {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {

            for (int minute = 0; minute <= 59; minute++) {

                for (int seconds = 0; seconds <= 59; seconds++) {

                    System.out.printf("%d : %d : %d%n", hour, minute, seconds);
                }
            }
        }
    }
}