import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмірність матриці n (більше 20): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Елемент M[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Обчислення сум елементів рядків і стовпців
        int[] rowSums = new int[n];
        int[] colSums = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSums[i] += matrix[i][j];
                colSums[j] += matrix[i][j];
            }
        }

        // Пошук рядків і стовпців з однаковими сумами елементів
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rowSums[i] == colSums[j]) {
                    System.out.println("Рядок " + i + ", Стовпець " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Немає рядків і стовпців з однаковими сумами елементів.");
        }

        scanner.close();
    }
}
