package me.drayff;

public class MatrixTest {
    public static void Test() {
        int[][] myMatrix = SimpleMatrix.createMatrix(10);
        for (int i = 0; i < 10; i++) {
            myMatrix = SimpleMatrix.binaryTurnOn(myMatrix, i, 0);
            myMatrix = SimpleMatrix.binaryTurnOn(myMatrix, i, 9);
            myMatrix = SimpleMatrix.binaryTurnOn(myMatrix, 0, i);
            myMatrix = SimpleMatrix.binaryTurnOn(myMatrix, 9, i);
        }

        int j = 9;
        for (int i = 0; i < 10; i++) {
            myMatrix = SimpleMatrix.binaryTurnOn(myMatrix, i, j);
            j--;
        }
        for (int i = 0; i < 10; i++) {
            myMatrix = SimpleMatrix.binaryTurnOn(myMatrix, i, i);
        }
        SimpleMatrix.draw(myMatrix, "*");
    }

}
