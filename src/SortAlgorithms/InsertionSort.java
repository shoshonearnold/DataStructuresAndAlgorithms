package SortAlgorithms;

public class InsertionSort {

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void insertionSort() {
        int[] givenArray = {54, -34, 6, 99, 876, 2, 55};
        for (int lastUnsortedIndex = givenArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (givenArray[i] > givenArray[largest]) {
                    largest = i;
                }
            }
            swap(givenArray, lastUnsortedIndex, largest);
        }
        for (int i = 0; i < givenArray.length; i++) {
            System.out.println(givenArray[i]);
        }

    }



    public static void main(String[] args) {
        insertionSort();
    }
}
