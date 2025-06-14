# [Binogic](https://github.com/Gre4ko/Binogic)
This module can be used to work with matrices and provides several methods for manipulating a matrix represented by a two-dimensional array of integers.
## In the BinMatrix class, you'll find the following methods with a brief analysis:

1. `binaryNegation(int x, int y)`:
   - This method takes a coordinates (`x` and `y`) of an element.
   - If the element at the specified coordinates is 0, it changes to 1, and vice versa.
   - The method modifies the matrix and returns it.

2. `binaryTurnOn(int x, int y)`:
   - This method takes a coordinates (`x` and `y`) of an element.
   - If the element at the specified coordinates is 0, it is set to 1.
   - The method modifies the matrix and returns it.

3. `binaryTurnOff(int x, int y)`:
   - This method is similar to `binaryTurnOn`, but if the element at the specified coordinates is 1, it is set to 0.

## There's also the DrawMatrix class with the following methods:

1. `consoleDraw(BinMatrix matrix, String pixel)`:
   - This method takes a matrix and a string `pixel` to use for displaying non-zero elements of the matrix.
   - It creates a string representation of the matrix where `pixel` is used for non-zero elements and spaces for zero elements.
   - The result is returned as a string.

2. `guiDraw(BinMatrix matrix, String name, int height, int width)`:
   - This method takes a matrix, window name, as well as height  and width  to use for displaying matrix elements.
   - It creates a graphical representation of the matrix.
   - Method result: Creating a graphical representation of the matrix.

## And the GeometryMatrix with following methods:
1. `rectangle(BinMatrix matrix, int xStart, int xEnd, int yStart, int yEnd)`:
   - This method takes a coordinates (`xStart`, `xEnd`, `yStart`, and `yEnd`) defining a region.
   - It draws a filled rectangle within the specified area.
   - The method modifies the matrix.
   
## The project is open to cooperation and is ready to carefully consider your ideas for improvement. If you have any suggestions, please feel free to propose changes via pull requests or create new issues.
