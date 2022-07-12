/*Вычислить факториал заданого пользователем числа.
 Решить задачу двумя способами (с помощью цикла, с помощью рекурсии)*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        /* int n = 5;
        int k = 1;
        for(int i = 1; i <= n; i++) {
            k = i*k;
        }
        System.out.println(k); */

        System.out.println(fact(Integer.parseInt(bR.readLine())));

    }
    public static int fact(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * fact(n-1);
        return result;
    }

}