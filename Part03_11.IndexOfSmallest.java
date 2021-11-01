import java.util.ArrayList;

import java.util.Scanner;

 

public class IndexOfSmallest {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        // implement here a program that reads user input

        // until the user enters 9999

        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

 

            if (userInput == 9999) {

                break;

            }

 

            numbers.add(userInput);

        }

        // after that, the program prints the smallest number

        // and its index -- the smallest number

        // might appear multiple times

        int smallest = Integer.MAX_VALUE;

        int iterator = 0;

        

        while (iterator < numbers.size()) {

            if (numbers.get(iterator) < smallest) {

                smallest = numbers.get(iterator); 

            }

 

            iterator++;

        }

 

        System.out.println("Smallest number: " + smallest);

 

        iterator = 0;

 

        while (iterator < numbers.size()) {

            if (smallest == numbers.get(iterator)) {

                System.out.println("Found at index: " + iterator);

            }

 

            iterator++;

        }

    }

}
