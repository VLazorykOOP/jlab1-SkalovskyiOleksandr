import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(500, 1, 10); // Генеруємо масив з 500 елементів, числа від 1 до 10

        int maxLength = 0;
        int maxStartIndex = 0;
        int currentLength = 1;
        int currentStartIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStartIndex = currentStartIndex;
                }
            } else {
                currentLength = 1;
                currentStartIndex = i;
            }
        }

        int[] longestChain = Arrays.copyOfRange(array, maxStartIndex, maxStartIndex + maxLength);

        System.out.println("Згенерований масив: " + Arrays.toString(array));
        System.out.println("Найдовший ланцюжок однакових чисел: " + Arrays.toString(longestChain));
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}
