class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int up = 0, down = matrix.length - 1, mid = 0;
        int cols = matrix[0].length;
        while (up <= down) {
            mid = (up + down) >>> 1;
            if (target > matrix[mid][cols - 1]) {
                up = mid + 1;
            } else if (target < matrix[mid][0]) {
                down = mid - 1;
            } else {
                return Arrays.binarySearch(matrix[mid], target) >= 0;
            }
        }
        return false;
    }
}
