import java.util.Arrays;
import java.util.Scanner;

/*
Задача *:
Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой.
Формат входных данных:
Программа получает на вход два числа n и m.
Формат выходных данных:
Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
символа.
 */

public class Lesen3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 'n' и 'm' поочередно: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    arr[i][j] += k;
                    k++;
                }
            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] += k;
                    k++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
