import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("The Sorted Array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Please Enter Elements in Array");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        SelectionSort.selectionSort(a);

    }
}
