// For submission
public class Task2 {
    public static void main(String[] args) {
        char letterH = 'H';
        char letterD = 'd';
        int three = 3;
        short eleven4LL = 11;
        byte zero = 0;
        int one4L = 1;
        float version = 2.0f;
        boolean flag = true;

        String output = ("" + letterH + three + eleven4LL + zero 
                + " w" + zero + "r" + one4L + letterD 
                + " " + version + " " + flag);
        System.out.println(output);
        // H3110 w0r1d 2.0 true
    }
}
1: public class WaterBottle {
2: private String brand;
3: private boolean empty;
4: public static void main(String[] args) {
5:        WaterBottle wb = new WaterBottle();
6:        System.out.print("Empty = " + wb.empty);
7:        System.out.print(", Brand = " + wb.brand);
8: } }