package Array;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static int[] moveZeros(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        int[] temp = new int[count];

        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[k++] = arr[i];
            }
        }

        int l = 0;

        for (int i = 0; i < count; i++) {
            arr[i] = temp[l++];
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 0, 4, 2, 0, 7, 9, 0, 12 };

        System.out.println(Arrays.toString(moveZeros(arr)));
    }
}
