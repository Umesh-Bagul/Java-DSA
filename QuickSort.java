import java.util.Arrays;

public class QuickSort {

    public static int[] quickSortHelper(int[] arr, int low, int high) {

        if (low < high) {

            int pIndex = partition(arr, low, high);

            quickSortHelper(arr, low, pIndex - 1);
            quickSortHelper(arr, pIndex + 1, high);
        }

        return arr;
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];

        int i = low + 1;
        int j = high;

        while (i <= j) {

            if (pivot < arr[i] && arr[j] < pivot) {

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
                j--;

            } else if (pivot < arr[i]) {

                // arr[i] is greater than pivot,
                // but arr[j] is also greater/equal.
                j--;

            } else if (arr[j] < pivot) {

                // arr[j] is smaller than pivot,
                // but arr[i] is also smaller/equal.
                i++;

            } else {

                // Both are already on their correct sides
                i++;
                j--;
            }
        }

        // Put pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {

        int[] arr = { 12, 45, 69, 33, 7, 55, 33, 75, 31 };

        System.out.println(
                Arrays.toString(quickSortHelper(arr, 0, 8)));
    }
}