    package me.drayff;
    import javax.swing.*;
    import java.awt.*;
    import java.util.Arrays;
    public class SimpleMatrix {
        public static int[][] createMatrix(int sizeOfMatrix) {
            try {
                int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
                for(int i = 0; i < sizeOfMatrix; i++) {
                    Arrays.fill(matrix[i], 0);
                }
                return matrix;
            }

            catch (NegativeArraySizeException e){
                System.out.println("ERROR: Matrix can not have negative size!\n" + e);
                int[][] matrix = new int[0][0];
                return matrix;
            }
        }
        public static void consoleDraw(int [][] matrix, String pixel){
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

        public static void guiDraw(int [][] matrix, String name){
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame(name);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500, 500);

                JPanel panel = new JPanel(new GridLayout(matrix.length, matrix[0].length));

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        JPanel cell = new JPanel();
                        cell.setPreferredSize(new Dimension(50, 50));

                        if (matrix[i][j] == 0) {
                            cell.setBackground(Color.WHITE);
                        } else if (matrix[i][j] == 1) {
                            cell.setBackground(Color.BLACK);
                        }

                        panel.add(cell);
                    }
                }

                frame.add(panel);
                frame.setVisible(true);
            });
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
                    SimpleMatrix.binaryTurnOn(matrix, i, j);
                }
            }
            return matrix;
        }

    }