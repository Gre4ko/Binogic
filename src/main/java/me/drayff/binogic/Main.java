package me.drayff.binogic;

class Main {
    public static void main(String[] args) {
        BinMatrix objectMatrix = new BinMatrix();
        objectMatrix.createMatrix(10);
        int matrixLength = objectMatrix.getMatrix().length;

        for(int j = 0; j < matrixLength; j+=2) {
            for(int i = 0; i < matrixLength; i+=2) {
                objectMatrix.rectangle(i,i+1,j,j+1);
                objectMatrix.rectangle(i+1,i+2,j+1,j+2);
            }
        }

        DrawMatrix.consoleDraw(objectMatrix, "*");
        DrawMatrix.guiDraw(objectMatrix, "Matrix GUI",500,500);
    }
}
