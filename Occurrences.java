//Olivia Mirly
//HW 12
//This program counts and displays how many times the user inputs a number

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] occurrences = new int[9];
        int current = 2;

        System.out.println("Enter integers between 1 and 10, ending with a zero.");
        while(current != 0) {
            current = input.nextInt();
            //i tried a do while loop for this which did not work so unnecessary if statement it is
            if(current != 0) {
                occurrences[current - 1]++;
            }
        }

        for(int i = 0; i < 9; i++) {
            if(occurrences[i] != 0) {

                String plural = "";
                if(occurrences[i] == 1) {
                    plural = "time";
                } else {
                    plural = "times";
                }

                System.out.println((i + 1) + " occurs " + occurrences[i] + " " + plural);
            }
        }

    }
}
