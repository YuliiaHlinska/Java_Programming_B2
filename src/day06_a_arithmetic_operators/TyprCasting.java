package day06_a_arithmetic_operators;

public class TyprCasting {

    public static void main (String [] arg){

       //smaller to bigger
        byte b = 40;
        int i = b; // the byte value is automatically CONVERTED to int, because byte is smalled than int
                  // We are not changing the data type of b, we are changing the data type of value, we are assigning to i taking i  to b;

        System.out.println(b);
        System.out.println(i);
        System.out.println();

        //bigger to smaller
        int i2 = 100;
        byte b2 = (byte) i2; // CONVERSION - int is bigger than byte, so we must CAST it. We can the int type  - i2 to a byte type using (byte)

        System.out.println(i2);
        System.out.println(b2);
        System.out.println();


        int i3 = 500;
        long l1 = 13; // I am going from small --->>> big. int is smaller than long, so it will AUTOMATICALLY cast.

        long l2 = 200;
        int i4 = (int)l2; // long is bigger than int, we must CAST it

        System.out.println(l2);
        System.out.println(i4);


        System.out.println();
        double d = 50; // System out print will be 50.0, BUT if it will be int -->>> 50
        int i5 = (int)d;
        System.out.println(d);
        System.out.println(i5);


        System.out.println();
        double d2 = 40; //bigger to smaller
        byte b3 = (byte)d2;
        System.out.println(d2);
        System.out.println (b3);


        System.out.println();
     // With the numbers outside the range .
        // Some of the data will be lost -  DATA LOST
        //bigger to smaller .... narrowing (сужать) casting
        int i6 = 200;
        byte b4 = (byte)i6;

        System.out.println(i6);
        System.out.println(b4);

        System.out.println();
        double d3 = 45.56;
        int i7 = (int)d3;
        System.out.println(d3);
        System.out.println(i7);

    }


}
