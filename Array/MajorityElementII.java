import java.util.*;

public class MajorityElementII {
    public static List majorityElementII(int[] nums) {
        List<Integer> lt = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Conforming the valid candidates
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1 && count1 > 0) {
                count1++;
            } else if (nums[i] == candidate2 && count2 > 0) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Setting the counters to zero to find the actual count of candidates
        count1 = 0;
        count2 = 0;

        // Checking the actual count
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            }
        }

        // Verifying that if count is greater than n/3
        if (count1 > nums.length / 3) {
            lt.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            lt.add(candidate2);
        }
        return lt;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 5, 6, 1, 7, 6, 5, 6, 6 };

        System.out.println(majorityElementII(arr));
    }
}
