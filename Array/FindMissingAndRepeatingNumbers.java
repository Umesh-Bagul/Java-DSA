import java.util.Arrays;

public class FindMissingAndRepeatingNumbers {

    public static int[] missingAndRepeating(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        int missin = -1;
        int repeated = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeated = i;
            }
            if (freq[i] == 0) {
                missin = i;
            }
        }
        return new int[] { missin, repeated };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 6, 4, 8, 5 };

        System.out.println(Arrays.toString(missingAndRepeating(arr)));
    }
}
