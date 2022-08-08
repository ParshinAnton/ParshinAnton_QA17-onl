package lesson3.task1;


import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        int[] array = makeMassiveUsingKeybord();
        printMassive(array);
        printSortedDescMassive(array);

    }

    public static int[] makeMassiveUsingKeybord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter massive size: -> ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printMassive(int[] array) {
        System.out.println("Your base massive is: ");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println(array[array.length - 1]);
    }

    public static void printSortedDescMassive(int[] array) {
        System.out.println("Sorted massive DESC: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
