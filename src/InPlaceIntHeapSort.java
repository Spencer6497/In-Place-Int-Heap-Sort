/*
    This program provides a method for implementing a heap sort "in-place" by not allocating a heap object to reduce
    memory waste, and instead using a small number of local variables to perform the operation.
 */

public class InPlaceIntHeapSort {
    public static void heapSort(int[] array) {
        int n = array.length; // Store length of array in integer variable n

        // Part I: Turn the array into a max-heap
        for (int i = n / 2; i >= 0; i--) {
            makeHeap(array, i, n);
        }

        // Part II: Repeatedly extract the max element from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Swap root with the end of the array
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Recursively make a heap out of the remainder of the invalid heap
            makeHeap(array, 0, i);
        }
    }

    // Recursive function used to create a heap out of a complete binary tree
    static void makeHeap(int[] array, int i, int n) {
        // Create variables to store left and right child indices, and max index
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;
        int maxIndex = i;

        // If left child is greater, set max index equal to left child index
        if (leftChildIndex <= n - 1 && array[leftChildIndex] > array[maxIndex]) {
            maxIndex = leftChildIndex;
        }

        // If right child is greater, set max index equal to right child index
        if (rightChildIndex <= n - 1 && array[rightChildIndex] > array[maxIndex]) {
            maxIndex = rightChildIndex;
        }

        // If max index is already greater than both children, recursively call
        if (maxIndex != i) {
            int tempElement = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = tempElement;
            makeHeap(array, maxIndex, n);
        }
    }
}
