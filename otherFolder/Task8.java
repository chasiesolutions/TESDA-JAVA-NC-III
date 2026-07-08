/*
Write a program featuring an integer variable arguments method. The method should return the sum of all parameters and, for each parameter, 
the cumulative sum up to that point. For instance, given parameters (4, 5, 10), the program should compute the total for the first parameter, 
such as 4 = (1+2+3+4), and repeat this process for subsequent parameters.
*/
package otherFolder;

public class Task8 {
    public static void main(String[] args) {

        int totalSum = sumOfCumulativeSum(4, 5, 10);
        
        System.out.println("The Sum of the Cumulative Sum is: " + totalSum);
    }

    public static int sumOfCumulativeSum(int... numbers) {
        int sumOfCSum = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println("The cumulative sum for #" + num + " is: " + cumulativeSum);
            
            sumOfCSum += cumulativeSum;
        }

        return sumOfCSum;
    }
}