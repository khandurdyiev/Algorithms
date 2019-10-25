public class Matrix {
    public static int[][] create(int m, int n) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        return matrix;
    }
}
