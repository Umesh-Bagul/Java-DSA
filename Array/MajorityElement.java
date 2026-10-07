package Array;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int candidate = 0;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else
                count--;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 3, 3, 2, 2, 3, 2, 2, 2, 2 };

        System.out.println(majorityElement(arr));
    }
}
