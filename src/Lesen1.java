import java.util.Random;
import java.util.Scanner;

/*
Задача 1:
1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.
 */
public class Lesen1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Массив до того как добавили значение:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Введите переменную для добавления в массив: ");
        int usEnter = scanner.nextInt(); // пользовательская переменная.
        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                arr[i][j] += usEnter;
            }
        }
        System.out.println("Массив после добавления значения:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}