//
import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();

        //condition
        if(num > 0){
            System.out.println(num + " is a postive number");
        }
        else if(num < 0){
            System.out.println(num + " is a negative number");
        }
        else{
            System.out.println("number is zero");
        }


    }
}
