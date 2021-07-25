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
        int[] givenArray = { 78, 43, 90, 12, 2, 1, -8};
        for (int lastUnsortedIndex = givenArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
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
