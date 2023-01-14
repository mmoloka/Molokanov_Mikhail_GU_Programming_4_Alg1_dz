/*
Найти сумму элементов главной и побочной диагоналей в двумерном массиве.
 */

public class Task3 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4, 5},
                          {1, 2, 3, 5, 5},
                          {1, 2, 5, 4, 5},
                          {1, 5, 3, 4, 5},
                          {5, 2, 3, 4, 5}};
        System.out.println(findMainDiagonalSum(matrix));
        System.out.println(findSecondaryDiagonalSum(matrix));
        System.out.println("Оба метода поиска суммы элементов главной и побочной диогоналей " +
                "в двумерном равностороннем массиве имеют сложность O(n).");
    }

    public static int findMainDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int j = i;
            sum += matrix[i][j];
        }
        return sum;
    }

    public static int findSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int j = matrix.length - 1 - i;
            sum += matrix[i][j];
        }
        return sum;
    }
}
