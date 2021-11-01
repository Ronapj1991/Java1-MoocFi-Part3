public class Printer {

 

    public static void main(String[] args) {

        // You can test the method here

        int[] array = {5, 1, 3, 4, 2};

        printArrayInStars(array);

    }

 

    public static void printArrayInStars(int[] array) {

        // Write some code in here

        //iterate over the array

        //print the number of stars by the number of each Value

    	

    	for (int i = 0; i < array.length; i++) {

    		String line = "";

    		int eachNum = array[i];

    		

    		while (eachNum > 0) {

    			line += "*";

    			eachNum--;

    		}

    		

    		System.out.println(line);

    	}

        

    }

 

}
