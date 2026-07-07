/*
Create a program where user inputs two numbers and perform 4 basic arithmetic operations using 4 methods with return types and print the results.
*/
package otherFolder;

import java.util.*;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner keyboard_scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
        double num1 = keyboard_scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = keyboard_scanner.nextDouble();

		double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);
        
        System.out.println("The sum of num1 & num2 is : " + sum);
        System.out.println("The difference of num1 & num2 is : " + difference);
        System.out.println("The product of num1 & num2 is : " + product);
       	System.out.println("The quotient of num1 & num2 is : " + quotient);
        
        keyboard_scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }
}