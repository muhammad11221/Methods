import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Letter: ");

        ArrayList<String> letters = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String word = input.nextLine();
            letters.add(word);
        }


        Collections.sort(letters);

        System.out.println("List after sorting:");
        for (String s : letters) {
            System.out.println(s);


        }
    }
}
