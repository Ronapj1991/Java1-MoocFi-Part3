import java.util.Scanner;

 

public class NameOfTheOldest {

 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int oldestAge = 0;

		String oldestName = "";

		

		while (true) {

			String user = scanner.nextLine();

			

			if (user.equals("")) {

				break;

			}

			

			String[] arr = user.split(",");

			int currentAge = Integer.valueOf(arr[1]);

			String currentName = arr[0];

			

			if (currentAge > oldestAge) {

				oldestAge = currentAge;

				oldestName = currentName;

			}

		}

		

		System.out.println("Name of the oldest: " + oldestName);

  }

}
