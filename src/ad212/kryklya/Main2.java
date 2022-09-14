package ad212.kryklya;

public class Main2 {
    public static void main(String[] args) {
        Task2();
    }

    static void Task2() {
        System.out.println("Task2");
        String text1 = "Fizz";
        String text2 = "Buzz";

        for (int i = 1; i < 100 + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" " + text1 + text2);
            } else if (i % 3 == 0) {
                System.out.print(" " + text1);
            } else if (i % 5 == 0) {
                System.out.print(" " + text2);
            } else {
                System.out.print(" " + i);
            }
        }
    }
}

