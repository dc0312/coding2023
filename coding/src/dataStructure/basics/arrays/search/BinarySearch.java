package dataStructure.basics.arrays.search;

public class BinarySearch {

    private static boolean findByBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length -1;

        while (!(low > high)) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid  + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Item 2 found : " + findByBinarySearch(arr, 2));
        System.out.println("Item 9 found : " + findByBinarySearch(arr, 9));
        System.out.println("Item 8 found : " + findByBinarySearch(arr, 8));
        System.out.println("Item 1 found : " + findByBinarySearch(arr, 1));
    }
}
