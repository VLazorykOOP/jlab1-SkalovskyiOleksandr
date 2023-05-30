import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Варіант 1: вхідні дані дійсного типу, результат - дійсного
        System.out.println("Введіть значення a (дійсне число):");
        double a = scanner.nextDouble();

        System.out.println("Введіть значення b (дійсне число):");
        double b = scanner.nextDouble();

        double result1 = (a / (Math.pow(b, 2) - 2)) + (b / (Math.pow(a, 2) + 2)) + Math.pow(a * b, 3);
        System.out.println("Результат (дійсний тип): " + result1);

        // Варіант 2: вхідні дані цілого типу, результат - дійсного
        System.out.println("Введіть значення a (ціле число):");
        int aInt = scanner.nextInt();

        System.out.println("Введіть значення b (ціле число):");
        int bInt = scanner.nextInt();

        double result2 = (aInt / (Math.pow(bInt, 2) - 2)) + (bInt / (Math.pow(aInt, 2) + 2)) + Math.pow(aInt * bInt, 3);
        System.out.println("Результат (дійсний тип): " + result2);

        // Варіант 3: вхідні дані дійсного типу, результат - цілого
        System.out.println("Введіть значення a (дійсне число):");
        double aDouble = scanner.nextDouble();

        System.out.println("Введіть значення b (дійсне число):");
        double bDouble = scanner.nextDouble();

        int result3 = (int) ((aDouble / (Math.pow(bDouble, 2) - 2)) + (bDouble / (Math.pow(aDouble, 2) + 2)) + Math.pow(aDouble * bDouble, 3));
        System.out.println("Результат (цілий тип): " + result3);

        scanner.close();
    }
}
