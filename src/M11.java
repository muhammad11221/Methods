import java.util.Scanner;

public class M11 {
    //Take integer input from the user, output whether it's odd or even.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();
        boolean check = isEven(n);
        if(check){

            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static boolean isEven(int num){
        if (num%2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
