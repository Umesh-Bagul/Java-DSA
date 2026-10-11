import java.util.Arrays;

public class numberOfInversions {

    public static long inversions(int[] nums, int low, int high) {
        return mergeSort(nums, low, high);
    }

    public static long mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            System.out.println("Base case: " + Arrays.toString(
                    Arrays.copyOfRange(nums, low, high + 1)));
            return 0;
        }

        int mid = low + (high - low) / 2;

        System.out.println("\nDividing: low = " + low
                + ", mid = " + mid + ", high = " + high);

        System.out.println("Left half: "
                + Arrays.toString(Arrays.copyOfRange(nums, low, mid + 1)));

        System.out.println("Right half: "
                + Arrays.toString(Arrays.copyOfRange(nums, mid + 1, high + 1)));

        long count = 0;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);

        long mergeCount = merge(nums, low, mid, high);

        count += mergeCount;

        System.out.println("After merging indices " + low + " to " + high
                + ": " + Arrays.toString(
                        Arrays.copyOfRange(nums, low, high + 1)));

        System.out.println("Inversions found in this merge: " + mergeCount);

        return count;
    }

    public static long merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        long count = 0;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];

                long added = mid - i + 1;
                count += added;

                System.out.println("Inversion found: added "
                        + added + ", total in this merge = " + count);
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            nums[low + l] = temp[l];
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 7, 1, 3, 5 };

        System.out.println("Original array: " + Arrays.toString(arr));

        long total = inversions(arr, 0, arr.length - 1);

        System.out.println("\n========================");
        System.out.println("Total inversions: " + total);
        System.out.println("Final sorted array: " + Arrays.toString(arr));
    }
}