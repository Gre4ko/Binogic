package me.drayff;

import java.util.Arrays;

public class SimpleMatrix {
    private int[][] matrix;

    public void createMatrix(int sizeOfMatrix) {
        this.matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for(int i = 0; i < sizeOfMatrix; i++) {
            Arrays.fill(this.matrix[i], 0);
        }
    }

    public void binaryReverse(int x, int y) {
        if (this.matrix[x][y] == 0)
            this.matrix[x][y] = 1;
        else
            this.matrix[x][y] = 0;
    }

    public void binaryTurnOn(int x, int y) {
        if (this.matrix[x][y] == 0)
            this.matrix[x][y] = 1;
    }

    public void binaryTurnOff(int x, int y) {
        if (this.matrix[x][y] == 1)
            this.matrix[x][y] = 0;
    }
    public void rectangle(int x0, int x1, int y0, int y1) {
        for (int i = x0; i < x1; i++) {
            for (int j = y0; j < y1; j++) {
                if (this.matrix[i][j] == 0)
                    this.matrix[i][j] = 1;
            }
        }
    }

    public int[][] getMatrix() {
        return this.matrix;
    }
}