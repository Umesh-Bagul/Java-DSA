package Array;

import java.util.Arrays;

public class UnionOfArrays {
    public static int[] union(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;

        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (k == 0 || temp[k - 1] != nums2[j]) {
                    temp[k++] = nums2[j];
                }
                j++;
            } else {
                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }

        while (i < nums1.length) {
            if (k == 0 || temp[k - 1] != nums1[i]) {
                temp[k++] = nums1[i];
            }
            i++;
        }
        while (j < nums2.length) {
            if (k == 0 || temp[k - 1] != nums2[j]) {
                temp[k++] = nums2[j];
            }
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 7 };

        int[] arr2 = { 1, 2, 4, 8, 9 };

        System.out.println(Arrays.toString(union(arr1, arr2)));
    }
}
