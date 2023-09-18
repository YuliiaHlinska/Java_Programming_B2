package day06_b_unary_operators;

public class IncrementExample2 {

    public static void main (String []arg){

        int age = 20;
        System.out.println(age); // 20
        System.out.println(age++); // 20 | x = 21
        System.out.println(age); //21
        System.out.println();

        //                  21 + 2
        System.out.println(age++ +2); //23 |but age become 22 - .. use it first and then update - POST
        System.out.println(age); //22

        //                  23 + 2
        System.out.println(++age +2); //age=23 | 25 -PRE, update it and then post
        System.out.println(age); //23

        //                  24      25     2
        System.out.println(++age + ++age + 2);  // age = 25;
        //                  25      26
        System.out.println(age++ + age++ + 2);








    }
}
