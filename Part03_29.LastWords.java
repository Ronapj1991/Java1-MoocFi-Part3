import java.util.Scanner;

 

public class LastWords {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        while (true) {

            String user = scanner.nextLine();

            

            if (user.equals("")) {

                break;

            }

 

            String[] arr = user.split(" ");

            System.out.println(arr[arr.length - 1]);

        }

    }

}
