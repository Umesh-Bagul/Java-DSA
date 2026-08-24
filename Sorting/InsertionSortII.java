import java.util.Arrays;

public class InsertionSortII {

    public static int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        return nums;
    }

    public static void main() {

        int[] arr = { 10, 44, 23, 9, 71, 32, 9 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
