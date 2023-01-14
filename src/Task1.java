/*
Рекурсивно найти n-ое число Фибоначчи. Определить сложность. (fn[0] = 1) [fn(n) = (fn(n - 1) + fn(n - 2)]
*/

public class Task1 {
    public static void main(String[] args) {

        System.out.println(fibonacсi(11));
        System.out.println("Алгоритм поиска n-го числа Фибоначчи методом рекурсии " +
                "является примером экспоненциальной сложности O(2^n).");
    }

    public static int fibonacсi(int num) {
        if (num <= 2) {
            return 1;
        } else return fibonacсi(num - 2) + fibonacсi(num - 1);
    }
}
