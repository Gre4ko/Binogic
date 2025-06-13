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

import me.drayff.binogic.BinMatrix;
import me.drayff.binogic.DrawMatrix;
import me.drayff.binogic.GeometryMatrix;

class ChessField {
    public static void main(String[] args) {
        BinMatrix objectMatrix = new BinMatrix(10);
        int matrixLength = objectMatrix.getMatrix().length;

        for(int j = 0; j < matrixLength; j+=2) {
            for(int i = 0; i < matrixLength; i+=2) {
                GeometryMatrix.rectangle(objectMatrix, i,i+1,j,j+1);
                GeometryMatrix.rectangle(objectMatrix, i+1,i+2,j+1,j+2);
            }
        }

        DrawMatrix.consoleDraw(objectMatrix, "*");
        DrawMatrix.guiDraw(objectMatrix, "Chess Field GUI",500,500);
    }
}
