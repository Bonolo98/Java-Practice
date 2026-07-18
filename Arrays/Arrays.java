package Arrays;

public class Arrays {
    public static void main(String[] args) {

        // One Dimensional Arrays
        // int[] arr = new int[5];
        // arr[0] = 4;
        // arr[1] = 2;
        // arr[2] = 7;
        // arr[3] = 0;
        // arr[4] = 3;

        // int arrLength = arr.length;

        // for (int i = 0; i < arrLength; i++) {
        // System.out.println(arr[i]);
        // }

        // Multi-dimensional Arrays

        int[][] nums = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                // System.out.println(nums[i][j] = (int) (Math.random() * 100));
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

}