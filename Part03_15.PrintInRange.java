import java.util.ArrayList;

 

public class PrintInRange {

 

    public static void main(String[] args) {

        // Try your method here

    }

    

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

		for (int eachNum: numbers) {

			if (lowerLimit <= eachNum && eachNum <= upperLimit) {

				System.out.println(eachNum);

			}

				

		}

	}

}
