/*
 * Copyright 2023 Andrew Motrych, and the Binogic contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
        matrix[x][y] = martix[x][y] == 0 ? 1 : 0;
    }

    public void binaryTurnOn(int x, int y) {
        matrix[x][y] = 1;
    }

    public void binaryTurnOff(int x, int y) {
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
