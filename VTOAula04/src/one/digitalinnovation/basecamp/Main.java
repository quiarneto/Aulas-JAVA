package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {
        byte b1; //downcast com perda de informação
        short s1 = 1000;
        b1 = (byte) s1;  // -24

        long l1; //upcast
        int i1 = 10;
        l1 = i1; // 10

        int i2; //downcast com perda de informação
        long l2 = 1000000000000000000L;
        i2 = (int) l2; // -1486618624

        int i3; //downcast sem perda de informação
        long l3 = 10000L;
        i3 = (int) l3; // 10000

        double d1;
        float f1 = 10.5f;
        d1 = f1; //10.5

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; //1000.58
        double d3 = 10000.58888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; //1000.589

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; //11

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3; //16

        System.out.println("b1: " + b1);
    }
}
