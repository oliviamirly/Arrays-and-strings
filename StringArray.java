//Olivia Mirly
//HW 12
//This program takes in strings and proccess them in several different ways

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] strings = new String[10];

        System.out.println("Enter 10 strings: ");

        for(int i = 0; i < 10; i++) {
            strings[i] = input.nextLine();
        }

        System.out.println("Your strings: ");
        for(int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + strings[i]);
        }

        System.out.println("\nDo a wrap around...");
        for(int i = 9; i >= 0; i--) {
            System.out.println((10 - i) + ". " + strings[i]);
        }

        System.out.println("\nEnter a character: ");
        String s = input.next();
        char c = s.charAt(0);

        System.out.println("\nStrings of yours that start with that character: ");
        for(int i = 0; i < 10; i++) {
            String temp = strings[i];
            if(temp.charAt(0) == c) {
                System.out.println(strings[i]);
            }
        }

    }
}
