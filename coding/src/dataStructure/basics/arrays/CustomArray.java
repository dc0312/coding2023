package dataStructure.basics.arrays;

/**
 * Create a custom array class with following functions:
 * 1. Insert
 * 2. Find an element.
 * 3. Delete an element.
 * 4. Display the elements in array.
 */
public class CustomArray {

    /**
     * This will store the elements in array.
     */
    private int[] arr;

    /**
     * This will track the size of the array.
     */
    private int nElems;

    private int maxSize;

    public CustomArray(int n) {
        this.maxSize = n;
        arr = new int[n];
        nElems = 0;
    }

    public void insert(int i) {
        if (nElems == maxSize) {
            System.out.println("Cannot insert element. Array is full.");
            return;
        }
        arr[nElems] = i;
        nElems++;
    }

    public boolean find(int key) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == key) {
                break;
            }
        }

        return j != nElems;
    }

    public boolean delete(int key) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == key) {
                break;
            }
        }

        if (j == nElems) {
            return false;
        } else {
            int k;
            for (k = j; k < nElems - 1; k++) {
                arr[k] = arr[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public int size() {
        return nElems;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        CustomArray array = new CustomArray(6);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);
        array.display();
        array.insert(7);

        System.out.println("Find element 5 " + array.find(5));
        System.out.println("Find element 7 " + array.find(7));

        array.delete(3);
        array.display();
        array.delete(6);
        array.display();
    }
}
