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

    //create sizeOfMatrix*sizeOfMatrix matrix
    public BinMatrix(int sizeOfMatrix) {
        matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for(int i = 0; i < sizeOfMatrix; i++) {
            Arrays.fill(matrix[i], 0);
        }
    }

    public BinMatrix(int[][] array) {
        matrix = array;
}

    //negation of element value in the matrix
    public void binaryNegation(int x, int y) {
        matrix[x][y] = matrix[x][y] == 0 ? 1 : 0;
    }

    //set matrix element to 1
    public void binaryTurnOn(int x, int y) {
        matrix[x][y] = 1;
    }

    //set matrix element to 0
    public void binaryTurnOff(int x, int y) {
        matrix[x][y] = 0;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
