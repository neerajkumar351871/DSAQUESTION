
public class leetcode73 {

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];// by default false.
        boolean[] col = new boolean[cols];// by default false.
        // check value have zero or not.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // make a value zero;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        printarr(matrix);

    }
}
