/*
Math Operations with Static Import
Create a Java program that performs basic math operations (addition, subtraction, 
multiplication, division) using static imports for the Math class methods. 
The program should have the following features:
- Define a class named Task9. 
- Inside the class, create static methods for addition, subtraction, multiplication, and division. 
- Each method should take two parameters and return the result. 
- Use static imports for the Math class methods (Math.addExact(), Math.subtractExact(), 
Math.multiplyExact(), Math.floorDiv()). 
- In the main method, demonstrate the use of these static methods by performing some math operations with different values. 
- Display the results of each operation. 
*/
package otherFolder;

import static java.lang.Math.*;

public class Task9 {

	public static void main(String[] args) {
				
        int theSum = addNumbers(8, 10);
        System.out.println("The sum of 8 & 10 is : " + theSum);
        
        int theDifference = subtractNumbers(10, 25);
        System.out.println("The difference of 10 & 25 is : " + theDifference);
        
        int theProduct = multiplyNumbers(12, 12);
        System.out.println("The product of 12 & 12 is : " + theProduct);
        
        int theQuotient = divideNumbers(23, 8);
        System.out.println("The quotient of 21 & 4 is : " + theQuotient);
    }

    public static int addNumbers(int num1, int num2) {
        return addExact(num1, num2); 
    }

    public static int subtractNumbers(int num1, int num2) {
        return subtractExact(num1, num2);
    }

    public static int multiplyNumbers(int num1, int num2) {
        return multiplyExact(num1, num2);
    }

    public static int divideNumbers(int num1, int num2) {
        return floorDiv(num1, num2);
    }
}