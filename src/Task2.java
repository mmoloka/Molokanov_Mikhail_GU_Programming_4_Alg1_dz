/*
Найти n-ое число Фибоначчи за O(n).
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(fibonacсi(11));
        System.out.println("Алгоритм поиска n-го числа Фибоначчи методом " +
                "дающим линейную сложность O(n).");
    }

    public static int fibonacсi(int num) {
        if (num < 2) {
            return 1;
        } else {
            int[] fibNums = new int[num];
            fibNums[0] = 1;
            fibNums[1] = 1;
            for (int i = 2; i < fibNums.length; i++) {
                fibNums[i] = fibNums[i - 2] + fibNums[i - 1];
            }
            return fibNums[num - 1];
        }
    }
}
