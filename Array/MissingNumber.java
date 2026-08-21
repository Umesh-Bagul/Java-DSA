package Array;

public class MissingNumber {

    public static int missing(int[] arr) {

        int sum = (arr.length * (arr.length + 1)) / 2;

        int newSum = 0;

        for (int i = 0; i < arr.length; i++) {
            newSum = newSum + arr[i];
        }

        int missing = sum - newSum;

        return missing;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 9, 6, 7, 5, 2, 3, 4 };
        System.out.println(missing(arr));
    }
}
