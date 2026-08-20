package Array;

import java.util.Arrays;

public class RemoveElement {

    public static int[] remove(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 3, 6, 8, 3, 2, 1, 1 };
        System.out.println(Arrays.toString(remove(arr, 1)));
    }
}
