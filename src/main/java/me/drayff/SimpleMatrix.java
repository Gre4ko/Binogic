    package me.drayff;
    import java.util.Arrays;
    public class SimpleMatrix {
        public static int[][] createMatrix(int sizeOfMatrix) {
            try {
                int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
                for(int i = 0; i < sizeOfMatrix; i++) {
                    Arrays.fill(matrix[i], 0);
                }
                return matrix; }

            catch (NegativeArraySizeException e){
                System.out.println("ERROR: Matrix can not have negative size!\n" + e);
                int[][] matrix = new int[0][0];
                return matrix;
            }
        }
        public static void draw(int [][] matrix, String pixel){
            StringBuilder temp = new StringBuilder();
            for (int[] ints : matrix) {
                temp.append("\n");
                for (int j = 0; j < matrix.length; ++j) {
                    if (ints[j] == 0)
                        temp.append("  ");
                    else
                        temp.append(pixel).append(" ");
                }

            }
            System.out.println(temp.toString());
        }
        public static int[][] binaryReverse(int [][] matrix, int x, int y) {
            if (matrix[x][y] == 0)
                matrix[x][y] = 1;
            else
                matrix[x][y] = 0;
            return matrix;
        }

        public static int[][] binaryTurnOn(int [][] matrix, int x, int y) {
            if (matrix[x][y] == 0)
                matrix[x][y] = 1;
            return matrix;
        }

        public static int[][] binaryTurnOff(int [][] matrix, int x, int y) {
            if (matrix[x][y] == 1)
                matrix[x][y] = 0;
            return matrix;
        }
        public static int[][] rectangle(int[][] matrix, int x0, int x1, int y0, int y1) {
            for (int i = x0; i < x1; i++) {
                for (int j = y0; j < y1; j++) {
                    matrix = SimpleMatrix.binaryTurnOn(matrix, i, j);
                }
            }
            return matrix;
        }
    }