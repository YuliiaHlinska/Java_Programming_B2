package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main (String []arg){

        int i = 5;
        int z = i++; //z=5 and i=6
        System.out.println(z);
        System.out.println(i);

     int a = 10;
     int b = a + 1; // it is not the same as a++;
     System.out.println(a); //10
     System.out.println(b); //11
        System.out.println();

        int c = ++a; // a = a + 1; a = 11
        System.out.println(c); //11
        System.out.println(a); //11




    }
}
