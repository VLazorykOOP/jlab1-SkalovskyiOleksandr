import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        System.out.println("Слова, які є симетричними:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.print(word + " ");
            }
        }
        in.close();
    }

    private static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
