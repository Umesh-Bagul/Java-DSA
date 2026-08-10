import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return arr;
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);

        return arr;

    }

    public static int[] merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;

        int right = mid + 1;

        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 55, 9, 1, 1, 33, 2, 5, 88, 41, 3, 66, 77, 9, 9 };

        System.out.println(Arrays.toString(mergeSort(arr, 0, 14)));
    }
}
