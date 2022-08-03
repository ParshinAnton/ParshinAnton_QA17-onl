package lesson2;

import java.util.Scanner;

/**
 * The program should show the number of the age group of person, whose age was added by the console.
 * The groups range:
 * 1 - from 7 to 13 y.o.
 * 2 - from 14 to 17 y.o.
 * 3 - from 18 to 65 y.o.
 * For e.g.:
 * input:10
 * output:1
 */

public class TaskOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the age of the person: ");
        int ageOfThePerson = console.nextInt();

        if (7 <= ageOfThePerson && ageOfThePerson <= 13) {
            System.out.println("1");
        } else if (14 <= ageOfThePerson && ageOfThePerson <= 17) {
            System.out.println("2");
        } else if ((18 <= ageOfThePerson && ageOfThePerson <= 65)) {
            System.out.println("3");
        } else {
            System.out.println("-1");
        }
    }
}
