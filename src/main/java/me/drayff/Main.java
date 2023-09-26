package me.drayff;

class Main {
    public static void main(String[] args) {
        int [][] matrix = SimpleMatrix.createMatrix(10);

        for(int j = 0; j < matrix.length; j+=2) {
            for(int i = 0; i < matrix.length; i+=2) {
                SimpleMatrix.rectangle(matrix,i,i+1,j,j+1);
                SimpleMatrix.rectangle(matrix,i+1,i+2,j+1,j+2);
            }
        }

        DrawMatrix.consoleDraw(matrix, "*");
        DrawMatrix.guiDraw(matrix, "Matrix GUI",1000,1000);
    }
}
