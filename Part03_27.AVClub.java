import java.util.Scanner;

 

public class AVClub {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        while (true) {

        	String user = scanner.nextLine();

 

        	if (user.equals("")) {

        		break;

        	}

        	

        	String[] arr = user.split(" ");

        	for (String eachWord : arr) {

        		if (eachWord.contains("av")) {

        			System.out.println(eachWord);

        		}

        	}

        }

 

    }

}
