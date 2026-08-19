package Array;

public class LeftRotateArray {
    public static void leftRotateArray(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 34, 4, 21, 6, 77 };

        leftRotateArray(arr);
    }
}
