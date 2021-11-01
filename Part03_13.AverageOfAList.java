import java.util.ArrayList;

import java.util.Scanner;

 

public class AverageOfAList {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        // implement here a program, that first reads user input

        // adding them on a list until user gives -1.

        // Then it computes the average of the numbers on the list

        // and prints it.

        int total = 0;

        int inCount = 0;

        ArrayList<Integer> myNumbers = new ArrayList<>();

 

        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

            

            if (userInput == -1) {

                break;

            }

 

            myNumbers.add(userInput);

        }

 

        for (int eachNumber:myNumbers) {

            total += eachNumber;

            inCount++;

        }

 

        System.out.println("Average: " + ((double) total / inCount));

    }

}
