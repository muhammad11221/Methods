import java.util.Scanner;

public class M1 {
    public static void main (String []args){

        //addingnumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = input.nextInt();
        System.out.println("Enter a number : ");
        int num2 = input.nextInt();
        int sum = addingnumber(num1,num2);
        System.out.println(sum);

    }

    void a(){

    }
    int b(){
       return 0;
    }
    long c(){
            return 1;
    }
    char c2(){
        return 'a';
    }
    String d(){
            return "";
    }


    //Java Bean
    int num;
    public int getNum(){
        return 0;
    }

    public static int addingnumber(int num1,int num2){
        int sum = 0;
        sum = num1 + num2;
//        System.out.println(sum);
        return sum;
    }
}


