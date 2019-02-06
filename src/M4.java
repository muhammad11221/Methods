import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String Letters: ");


        String word = input.nextLine();


        long length = word.length();
        System.out.println(length);

    }
}
