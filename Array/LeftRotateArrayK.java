package Array;

import java.util.Arrays;

public class LeftRotateArrayK {

    public static int[] leftRotateArrayK(int[] arr, int k) {

        k = k % arr.length;

        int[] temp = new int[k];

        int j = 0;

        for (int i = 0; i < k; i++) {
            temp[j++] = arr[i];
        }

        for (int i = k; i <= arr.length - 1; i++) {
            arr[i - k] = arr[i];
        }

        int l = 0;

        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[l++];
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 7, 8, 3, 2, 1 };

        System.out.println(Arrays.toString(leftRotateArrayK(arr, 2)));
    }

}
