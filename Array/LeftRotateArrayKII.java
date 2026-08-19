package Array;

import java.util.Arrays;

public class LeftRotateArrayKII {

    public static int[] leftRotate(int[] arr, int k) {

        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        return arr;
    }

    public static int[] reverse(int[] arr, int left, int right) {

        while (right > left) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(leftRotate(arr, 3)));
    }
}
