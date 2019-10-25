import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[][] matrix = Matrix.create(m, n);

        int[][] transposedMatrix = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix" + Arrays.deepToString(matrix));
        System.out.println("Transposed Matrix" + Arrays.deepToString(transposedMatrix));
    }
}
