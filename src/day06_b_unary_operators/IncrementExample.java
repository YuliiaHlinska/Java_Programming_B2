package day06_b_unary_operators;

public class IncrementExample {

    public static void main (String []arg){

     int x = 0;
     System.out.println(x); //0

        x = x + 1; // take the value of x, which is o and add 1 ---> 0+1 --->1
        System.out.println(x); //1

        //In Java there is shorter way to write x+1 in two options:
        // POST-increment
        // PER- Increment

        // POST-increment:
        x++; // this will increase the valee by 1 --->>> x=x=1: ----> 1+1=2
        System.out.println(x); //2

        x++;
        System.out.println(x); //3
        System.out.println();

        // PER- Increment:
        ++x;
        System.out.println(x); //this will increase the valee by 1 --->>> x=x=1: ----> 3+1=4
        System.out.println();

       // Q: What is the difference ? Why do we two version?
        System.out.println(++x); //PER- Increment - it will update the x first and then print
        System.out.println(x++); //POSt- Increment  -it prints first anf then update the x

        System.out.println(x);


    }
}
