package org.johnwick182.tdd;

public class SumMatrix {

    public int sumMatrix(int[][] matrix) {
        if (matrix == null)
            throw new NullPointerException();

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
}
