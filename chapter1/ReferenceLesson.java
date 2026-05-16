package chapter1;

public class ReferenceLesson {
    public static void main(String[] args) {
        Box small = new Box();
        Box small2 = new Box();
        Box small3 = new Box();
        System.out.println(small.numbers[1]);
        System.out.println(small2.numbers[1]);

    }
}

class Box{
    int numbers[]= {1,2,3};
}
