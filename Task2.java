/* Create all of the primitives (except long and double) with 
different values. Concatenate them into a string and print it to
the screen so it will print:
H3110 w0rld 2.0 true
*/

public class Task2 {
    public static void main(String[] args) {
        char letterH = 'H', letterD = 'd';
        int three = 3, one4L = 1;
        short eleven4LL = 11;
        byte zero = 0;
        float version = 2.0f;
        boolean flag = true;
        String output = ("" + letterH + three + eleven4LL + zero 
                + " w" + zero + "r" + one4L + letterD 
                + " " + version + " " + flag);
        System.out.println(output);
    }
}