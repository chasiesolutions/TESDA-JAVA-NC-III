/*
Check whose largest number in 3 inputs
Write a program that takes in three numbers from the user and outputs the largest number. If all numbers are equal it will print "All numbers are equal".
*/

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner input_scan = new Scanner(System.in);

        System.out.println("Enter three numbers and I'll tell you which one is the largest.");
        System.out.print("Enter the first number: ");
        double num1 = input_scan.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input_scan.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = input_scan.nextDouble();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            double largest = num1; // Assume num1 is the largest to start
            
            if (num2 > largest) {
                largest = num2; // num2 is bigger, update our tracker
            }
            
            if (num3 > largest) {
                largest = num3; // num3 is bigger, update our tracker
            }
            
            System.out.println("The largest number is: " + largest);
        }
        
        input_scan.close();
    }
}