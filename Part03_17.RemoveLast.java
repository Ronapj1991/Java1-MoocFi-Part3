import java.util.ArrayList;

 

public class RemoveLast {

 

    public static void main(String[] args) {

        // Try your method in here

    }

 

    public static void removeLast(ArrayList<String> strings) {

		//remove the last value in the list

		if (strings.size() == 0) {

			return;

		}

		

		strings.remove(strings.size() - 1);

	}

}
