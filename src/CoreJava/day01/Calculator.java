// Simple Calculator program in java using switch case

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0); // to read a single character from the user input

        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if(num2 != 0){
                    System.out.println(num1 / num2);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }    
                break;
            default:
                System.out.println("Invalid operator");     
        }

    }
}