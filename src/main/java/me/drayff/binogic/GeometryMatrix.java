package me.drayff.binogic;


public class GeometryMatrix {

    //creating a rectangle using coordinates of points that are the ends of the diagonal
    public static void rectangle(BinMatrix matrix, int xStart, int xEnd, int yStart, int yEnd) {
        for (int i = xStart; i < xEnd; i++) {
            for (int j = yStart; j < yEnd; j++) {
                matrix.binaryTurnOn(i, j);
            }
        }
    }
}
