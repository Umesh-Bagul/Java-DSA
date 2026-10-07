import java.util.*;

public class LeadersInArray {
    public static List<Integer> leaders(int[] nums) {
        List<Integer> lead = new ArrayList<>();

        int max = nums[nums.length - 1];
        lead.add(max);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                lead.add(max);
            }
        }

        Collections.reverse(lead);
        return lead;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 99, 97, 4, 90 };

        System.out.println(leaders(arr));

    }
}
