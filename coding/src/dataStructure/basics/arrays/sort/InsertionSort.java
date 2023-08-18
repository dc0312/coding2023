package dataStructure.basics.arrays.sort;

import java.util.Arrays;

public class InsertionSort {

    private static  void insertionSort(int arr [] ){
        for(int j = 1; j < arr.length; j++){
            int i = j;
            int temp = arr[j];
            while(i > 0 && arr[i-1]>= temp){
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 3, 7, 5, 4};
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
