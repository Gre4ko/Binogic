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

public class OneDiagonal {
    public static void main(String[] args) {
        BinMatrix objectMatrix = new BinMatrix(10);
        int matrixLength = objectMatrix.getMatrix().length;

        for(int i = 0; i < matrixLength; i++) {
            objectMatrix.binaryTurnOn(i, i);
        }

        DrawMatrix.consoleDraw(objectMatrix, "*");
        DrawMatrix.guiDraw(objectMatrix, "One Diagonal GUI",500,500);
    }

}
