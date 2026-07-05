package ForLoop;

public class ForLoop {
    public static void main(String a[]) {
        int x;

        for (x = 0; x <= 10; x++) {
            System.out.println("This is x value: " + x);
        }

        for (x = 0; x <= 10; x += 2) {
            System.out.println("This is x value incremented by 2: " + x);
        }

        // for (int x = 10; x > 0; x--) {
        // System.out.println("This is x value: " + x);
        // }
    }

}