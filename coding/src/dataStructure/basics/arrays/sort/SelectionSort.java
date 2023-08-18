package dataStructure.basics.arrays.sort;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] arr) {
        for (int j = arr.length - 1; j >= 0; j--) {
            int max = j;
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
            swap(arr, j, max);
        }
    }

    private static void swap(int[] arr, int i, int max) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 3, 7, 5, 4};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
