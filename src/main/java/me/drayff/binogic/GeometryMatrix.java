package me.drayff.binogic;

public class GeometryMatrix {

    //creating a rectangle using coordinates of points that are the ends of the diagonal
    public void rectangle(BinMatrix matrix, int x0, int x1, int y0, int y1) {
        for (int i = x0; i < x1; i++) {
            for (int j = y0; j < y1; j++) {
                if (matrix[i][j] == 0)
                    matrix[i][j] = 1;
            }
        }
    }
}