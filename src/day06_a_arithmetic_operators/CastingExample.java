package day06_a_arithmetic_operators;

public class CastingExample {

    public static void main (String []arg){


        short numOne = 40;
        float numTwo = numOne; // short is smaller than float, so implicit casting happens.

        System.out.println(numOne);
        System.out.println(numTwo);


        System.out.println();
        float num3 = 100.5F; // bigger to smaller, so we MUST EXPLICITLY CAST it. NARROWING CASTING
        short num4 = (short)num3;
        System.out.println(num3);
        System.out.println(num4);

        System.out.println();

        float num5 = 300;
        byte num6 = (byte)num5;
        short num7 = (short)num5;

        System.out.println(num5);  // 300.0
        System.out.println(num6);  // range -128 --> 127
        System.out.println(num7);  // range


        System.out.println();
        char letter = 'A';    // char is smallet then int
        int letterINt = letter;
        System.out.println(letter);
        System.out.println(letterINt);

         System.out.println( (int) letter);

         int let2 = 66;
         char let3 = (char)let2;
         System.out.println(let3);
         System.out.println((char)66);

         System.out.println('&');



    }
}
