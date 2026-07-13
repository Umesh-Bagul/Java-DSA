import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 12, 22, 4, 11, 56, 77, 90 };

        System.out.println(Arrays.toString(BubbleSort.bubbleSort(a)));
    }
}
