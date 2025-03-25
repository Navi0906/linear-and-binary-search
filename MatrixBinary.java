public class MatrixBinary {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;  // Convert mid to row index
            int col = mid % cols;  // Convert mid to column index
            int midElement = matrix[row][col];

            if (midElement == target) {
                return true; // Target found
            } else if (midElement < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 10, 11},
                {12, 14, 16}
        };
        int target = 10;
        System.out.println("Target found: " + searchMatrix(matrix, target));
    }
}
