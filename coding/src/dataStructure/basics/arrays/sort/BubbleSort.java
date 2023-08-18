package dataStructure.basics.arrays.sort;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] arr) {

        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 3, 7, 5, 4};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
