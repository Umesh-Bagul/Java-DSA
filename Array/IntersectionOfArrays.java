package Array;

import java.util.Arrays;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] temp;

        if (n < m) {
            temp = new int[n];
        } else {
            temp = new int[m];
        }

        int i = 0;
        int j = 0;

        int k = 0;
        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            }
        }
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7 };

        int[] nums = { 1, 2, 5, 7, 9 };

        System.out.println(Arrays.toString(intersection(arr, nums)));
    }
}
