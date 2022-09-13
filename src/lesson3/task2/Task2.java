package lesson3.task2;

import java.util.Scanner;

public class Task2 {

    public static char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static int[] letterCounter = new int[26];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        countLetters(getAllLetters());
        screenSharing(alphabet, letterCounter);
    }

    public static char[] getAllLetters() {
        String stroka = scanner.nextLine();
        return stroka.toLowerCase().toCharArray();
    }

    public static void countLetters(char[] array) {
        for (char c : array) {
            for (int j = 0; j < alphabet.length; j++) {
                if (c == alphabet[j]) {
                    letterCounter[j]++;
                }
            }
        }
    }

    public static void screenSharing(char[] alphabet, int [] letterCounter){
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + " → " + letterCounter[i]);
        }
    }
}
