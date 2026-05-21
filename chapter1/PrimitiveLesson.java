package chapter1;

public class PrimitivesLesson {
    public static void main(String[] args) {
        boolean isRunning = true;
        char c = 65535; //65535 max, not negative
        byte b =1;//2^8
        short s= 128;
        int i= 32_767;
        long longer = 2_147_483_648L;
        float f=31.21F; //31f, 31.0F or 31.0f
        double d= 1.6;//  1.6d or  1.6D;
        System.out.println((Math.powExact(2,8)));
        System.out.println((Math.powExact(2,16)));
        // System.out.println((long)(Math.powExact(2,32)));
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(b );
        System.out.println(c);
        System.out.println(123_345.678_9);


    }
}
