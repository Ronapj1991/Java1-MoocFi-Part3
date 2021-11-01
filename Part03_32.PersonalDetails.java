import java.util.Scanner;

 

public class PersonalDetails {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputCount = 0;

        int sumOfYears = 0;

        String longestName = "";

 

        while(true) {

            String user = scanner.nextLine();

            

            if (user.equals("")) {

                break;

            }

 

            String[] arr = user.split(",");

            inputCount++;

            sumOfYears += Integer.valueOf(arr[1]);

            String currentName = arr[0];

 

            if (currentName.length() > longestName.length()) {

                longestName = currentName;

            }

        }

 

        System.out.println("Longest name: " + longestName);

        System.out.println("Average of the birth years: " + ((double) sumOfYears / inputCount));

    }

}
