public class Task4 {

    public static void main(String[] args) {
            String input = "radar";

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String reversed = sb.toString();

        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}