// A program to find the largest of three numbers
//package CoreJava.day01;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String args[ ]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number:");   
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number:");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the Largest Number");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the Largest Number");
        }
        else{
            System.out.println(num3 + " is the Largest Number");
        }   
    }
}