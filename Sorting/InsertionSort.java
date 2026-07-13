import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 55, 31, 10, 11, 6, 44, 67 };

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
