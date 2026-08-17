package Array;

import java.util.Arrays;

public class SecondLargestElement {
    public static int secondLargestElement(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 12, 56, 22, 4, 5, 11, 9, 88, 100, 56 };

        System.out.println(secondLargestElement(arr));
    }
}