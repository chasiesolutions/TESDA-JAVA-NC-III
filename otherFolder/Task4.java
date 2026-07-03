/*
Write a program that takes a string as input and checks if it is a palindrome. 
A palindrome is a word, number, or other sequence of characters that 
reads the same forward and backward. 

Your program should perform the following steps:

Use StringBuilder to create a new string that is a reverse of the input string.
Use the equals() method to check if the input string and 
the reversed string are the same.
If the strings are the same, print "The input string is a palindrome."
If the strings are not the same, print "The input string is not a palindrome."
*/
package otherFolder;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {

	    Scanner userinput_scan = new Scanner(System.in);
	    System.out.print("Enter a string. I'll tell you if it's a palindrome >>> ");
	    String userinput_str = userinput_scan.nextLine();

        StringBuilder sb = new StringBuilder(userinput_str);
        sb.reverse();
        String reversed_str = sb.toString();
	
        if (userinput_str.equals(reversed_str)) {
            System.out.println("The input string is a palindrome.");
        } else {
        System.out.println("The input string is not a palindrome.");
        }
        
        userinput_scan.close();
    }
}