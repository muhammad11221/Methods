import java.util.Scanner;

public class M2 {
    public static void main (String []args){

        //dividingnumber();
//dividingnumber();
        System.out.println(dividingnumber());
    }

    public static int dividingnumber(){
        int divide = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = input.nextInt();
        System.out.println("Enter a number : ");
        int num2 = input.nextInt();
        if (num2 == 0) {
            System.out.println("Undefined");
        }
        else{
            divide = num1 / num2;
        }
//        System.out.println(sum);

        return divide ;
    }


}