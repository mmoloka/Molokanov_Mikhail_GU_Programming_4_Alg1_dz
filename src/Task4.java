/*
 Реализовать сдвиг элементов в массиве на n влево или вправо.
*/

public class Task4 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (int x : shiftElements(26, array)) {
            System.out.print(x + ", ");
        }
        System.out.println();
        for (int x : shiftElements(-27, array)) {
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("Метод сдвига элементов в массиве имеет сложность O(n).");
    }

    public static int[] shiftElements(int n, int[] array) {
        int len = array.length;
        int[] arrayOut = new int[len];
        for (int i = 0; i < len; i++) {
            if (n > 0) {
                arrayOut[(i + n) % len] = array[i];
            } else {
                arrayOut[(len + n % len + i) % len] = array[i];
            }
        }
        return arrayOut;
    }
}
