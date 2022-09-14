package ad212.kryklya;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Task3();
    }

    static void Task3() {
        System.out.println("Task3");
        int number;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter array length no more than 2!");
            number = scanner.nextInt();

            if (number < 2) {
                System.out.println("The length of the array must be at least 2!");
            }
        } while (number < 2);

        array = new int[number]; //инициализация массива

        for (int i = 0; i < number; i++) {
            System.out.print("№" + (i + 1) + " element: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("- ");
        System.out.println(condition(array) ? "True" : "False"); //вызов функции
    }

    public static boolean condition(int[] array) {
        double num1 = 0;
        double num2 = 0;

        // находит все половины суммы массива
        for (int i : array) {
            num1 += i;
        }
        num1 /= 2;

        for (int i = 0; num2 < num1; i++) {
            num2 += array[i];
        }
        return num2 == num1;
    }
}


