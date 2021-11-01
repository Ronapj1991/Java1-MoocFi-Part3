import java.util.Scanner;

 

public class LineByLine {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

 

        while (true) {

 

            String user = scanner.nextLine();

            

            if (user.equals("")) {

                break;

            }

            

            String[] sentence = user.split(" ");

            for (String eachWord:sentence) {

                System.out.println(eachWord);

            }

        }

 

       

    }

}
