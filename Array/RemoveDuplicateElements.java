package Array;

import java.util.Arrays;
import java.util.Scanner;

class RemoveDuplicateElements {
    public static int remove(int[] nums) {

        Arrays.sort(nums);
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number of Elements in Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please Enter Elements in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Number of Unique Elements is : " + remove(arr));
    }
}