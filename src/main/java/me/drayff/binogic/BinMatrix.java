package me.drayff.binogic;

import java.util.Arrays;

public class BinMatrix {
    private final int[][] matrix;

    public BinMatrix(int sizeOfMatrix) {
        matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for(int i = 0; i < sizeOfMatrix; i++) {
            Arrays.fill(matrix[i], 0);
        }
    }

    public void binaryReverse(int x, int y) {
        if (matrix[x][y] == 0)
            matrix[x][y] = 1;
        else
            matrix[x][y] = 0;
    }

    public void binaryTurnOn(int x, int y) {
        if (matrix[x][y] == 0)
            matrix[x][y] = 1;
    }

    public void binaryTurnOff(int x, int y) {
        if (matrix[x][y] == 1)
            matrix[x][y] = 0;
    }
    public void rectangle(int x0, int x1, int y0, int y1) {
        for (int i = x0; i < x1; i++) {
            for (int j = y0; j < y1; j++) {
                if (matrix[i][j] == 0)
                    matrix[i][j] = 1;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
}