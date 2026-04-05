// Write a Java program to check whether a year is leap year or not.
//package CoreJava.day01;
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year:");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }
    }
    
}
