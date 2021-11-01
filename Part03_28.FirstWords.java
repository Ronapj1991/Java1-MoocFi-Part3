import java.util.Scanner;

 

public class FirstWords {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        while (true) {

            String user = scanner.nextLine();

            

            if (user.equals("")) {

                break;

            }

 

            String[] arr = user.split(" ");

            System.out.println(arr[0]);

        }

 

    }

}
