package SortAlgorithms;

public class MergeSort {

    public static void mergeSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        if (array[mid] >= array[mid - 1]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, start, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }

    public static void main(String[] args) {
        int[] givenArray = {54, -34, 6, 99, 876, 2, 55};
        mergeSort(givenArray, 0, givenArray.length);
        for (int i = 0; i < givenArray.length; i++) {
            System.out.println(givenArray[i]);
        }
    }
}
