package Classes;

class Add {

    public int add(int x, int y) {
        return x + y;

    }

}

public class Math {
    public static void main(String[] args) {

        Add addition = new Add();

        int result = addition.add(5, 5);

        System.out.println(result);

    }

}
