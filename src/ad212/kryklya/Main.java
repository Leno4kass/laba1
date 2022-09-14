package ad212.kryklya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
    }

    static void Task1() {
        System.out.println("Task1");
        Scanner scanner = new Scanner(System.in);//ввод данных пользователем
        int number; // перемення длины массива
        boolean condition;

        //пользователь вводит длину массива
        do {
            System.out.println("Enter array length no more than 2!");
            number = scanner.nextInt();
            if (number < 2) {
                System.out.println("The length of the array must be at least 2!");//предупреждение о ошибке
            }
        } while (number < 2);

        //инициализация массива
        int[] array = new int[number];
        System.out.println("Now enter the elements!");

        for (int i = 0; i < number; i++) {
            System.out.print("№" + (i + 1) + " element: ");
            array[i] = scanner.nextInt();

            //вычесляет условия истины и лжы
            if (i > 0 && array[i] <= array[i - 1]) {
                System.out.print("");
                condition = false;
            } else {
                condition = true;
            }

            System.out.println(condition);
        }
    }
}
