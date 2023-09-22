# Binogic
Этот код представляет собой Java-класс `SimpleMatrix`, который предоставляет несколько методов для работы с матрицей, представленной двумерным массивом целых чисел. Вот краткий анализ каждого метода:

1. `createMatrix(int sizeOfMatrix)`:
   - Метод создает квадратную матрицу заданного размера `sizeOfMatrix`.
   - Инициализирует все элементы матрицы нулями, используя `Arrays.fill`.

2. `draw(int [][] matrix, String pixel)`:
   - Метод принимает матрицу и строку `pixel`, которую нужно использовать для отображения ненулевых элементов матрицы.
   - Он создает строковое представление матрицы, где `pixel` используется для ненулевых элементов, а пробелы для нулевых элементов.
   - Результат возвращается в виде строки.

3. `binaryReverse(int [][] matrix, int x, int y)`:
   - Метод принимает матрицу и координаты элемента (`x` и `y`).
   - Если элемент в указанных координатах равен 0, то он становится равным 1, и наоборот.
   - Метод изменяет матрицу и возвращает ее.

4. `binaryTurnOn(int [][] matrix, int x, int y)`:
   - Метод также принимает матрицу и координаты элемента (`x` и `y`).
   - Если элемент в указанных координатах равен 0, то он устанавливается в 1.
   - Метод изменяет матрицу и возвращает ее.

5. `binaryTurnOff(int [][] matrix, int x, int y)`:
   - Этот метод аналогичен `binaryTurnOn`, но если элемент в указанных координатах равен 1, то он устанавливается в 0.

Пример использования этого класса может быть следующим:

```java
public static void main(String[] args) {
    int size = 4;
    int[][] matrix = SimpleMatrix.createMatrix(size);
    System.out.println("Initial Matrix:");
    System.out.println(SimpleMatrix.draw(matrix, "*"));

    int x = 1;
    int y = 2;
    matrix = SimpleMatrix.binaryTurnOn(matrix, x, y);
    System.out.println("Matrix after turning on element at (" + x + ", " + y + "):");
    System.out.println(SimpleMatrix.draw(matrix, "*"));

    x = 2;
    y = 3;
    matrix = SimpleMatrix.binaryTurnOff(matrix, x, y);
    System.out.println("Matrix after turning off element at (" + x + ", " + y + "):");
    System.out.println(SimpleMatrix.draw(matrix, "*"));

    x = 0;
    y = 0;
    matrix = SimpleMatrix.binaryReverse(matrix, x, y);
    System.out.println("Matrix after reversing element at (" + x + ", " + y + "):");
    System.out.println(SimpleMatrix.draw(matrix, "*"));
}
```

Этот код создает матрицу, включает, выключает и инвертирует элементы матрицы, а затем выводит результаты с использованием символа "*".
