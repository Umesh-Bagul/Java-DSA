import java.util.Arrays;

public class Sorting {

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

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

        int[] a = { 34, 67, 12, 33, 10, 5, 8, 99 };

        int[] b = { 77, 34, 55, 10, 1, 41, 6 };

        int[] c = { 51, 61, 11, 31, 5, 3, 2, 22, 88 };

        System.out.println(Arrays.toString(selectionSort(a)));

        System.out.println(Arrays.toString(bubbleSort(b)));

        System.out.println(Arrays.toString(insertionSort(c)));

    }
}
