import java.util.Scanner;

 

public class AgeOfTheOldest {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;

        

        while (true) {

        	String user = scanner.nextLine();

        	

        	if (user.equals("")) {

        		break;

        	}

        	

        	String[] arr = user.split(",");

        	int currentAge = Integer.valueOf(arr[1]);

        	

        	if (oldestAge < currentAge) {

        		oldestAge = currentAge;

        	}

        }

        

        System.out.println("Age of the oldest: " + oldestAge);

    }

}
