package WhiteBoardProblems;

public class BinarySearchCountNegativeNumbersInSortedMatrix {

    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int lastNeg = cols - 1;
        for (int row = 0; row < rows; row++) {
            if (grid[row][0] < 0) {
                count += cols;
                continue;
            } else if (grid[row][cols - 1] > 0) {
                continue;
            }
            int left = 0;
            int right = lastNeg;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (grid[row][mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return count;
    }
}
