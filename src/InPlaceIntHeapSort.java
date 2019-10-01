/*
    Spencer Peace
    CSC 364-001
    HW3: Sorting
    Dr. Jeff Ward

    This program provides a method for implementing a heap sort "in-place" by not allocating a heap object to reduce
    memory waste, and instead using a small number of local variables to perform the operation.
 */

public class InPlaceIntHeapSort {
    // Test class
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 1, 3};
        heapSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void heapSort(int[] array) {
        int n = array.length; // Store length of array in integer variable n

        // Part I: Turn the array into a max-heap
        for (int i = 1; i <= n - 1; i++) {
            // Declare int variable to store index of parent
            int parentIndex = (i - 1) / 2;

            // If element at i is greater than parent, "sift up" by swapping element
            if (array[i] > array[parentIndex]) {
                // Store current element in int variable
                int temp = array[i];

                // Swap elements
                array[i] = array[parentIndex];
                array[parentIndex] = temp;
            } else { // Max heap condition satisfied
                break;
            }
        }

        // Part II: Repeatedly extract the max element from the heap
        for (int i = n - 1; i >=  1; i--) {

        }
    }
}
