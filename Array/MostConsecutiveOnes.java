package Array;

public class MostConsecutiveOnes {
    public static int mostConsecutiveOnes(int[] arr) {
        int counter = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
                if (counter > count) {
                    count = counter;
                }
            } else
                counter = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 };

        System.out.println(mostConsecutiveOnes(arr));
    }
}
