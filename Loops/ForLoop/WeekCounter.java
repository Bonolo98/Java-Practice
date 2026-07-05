package Loops.ForLoop;

public class WeekCounter {

    public static void main(String[] args) throws InterruptedException {
        // Updated Week Counter with For Loop
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        for (String day : days) {
            System.out.println("Day: " + day);
            Thread.sleep(1000);

            int hour = 0;
            while (hour <= 23) {
                System.out.println(hour + ":00");
                hour++;
                Thread.sleep(1000);
            }
        }
    }

}
