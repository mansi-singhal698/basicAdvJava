import java.util.*;

public class RangeSum2D {
    static int[][] prefix; // 2D prefix sum array

    // Build 2D prefix sum matrix
    static void buildPrefix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        prefix = new int[n+1][m+1]; // extra row & col for easy boundaries

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefix[i][j] = matrix[i-1][j-1] 
                             + prefix[i-1][j] 
                             + prefix[i][j-1] 
                             - prefix[i-1][j-1];
            }
        }
    }

    // Query sum of submatrix (row1,col1) to (row2,col2)
    static int query(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++; // shift because of extra row/col
        return prefix[row2][col2] 
             - prefix[row1-1][col2] 
             - prefix[row2][col1-1] 
             + prefix[row1-1][col1-1];
    }

    // Driver code
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };

        buildPrefix(matrix);

        System.out.println(query(2, 1, 4, 3)); // Output: 8
        System.out.println(query(1, 1, 2, 2)); // Output: 11
        System.out.println(query(1, 2, 2, 4)); // Output: 12
    }
}