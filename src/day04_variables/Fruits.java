package day04_variables;

public class Fruits {

    public static void main (String [] args){

        int apples = 50; //declared and assigned variables
        int grapes = 100;
        int bananas = 150;


      // int apples = 50,grapes = 100, bananas = 150;
        // or this way if it is the same ONLY if you have the same data type

        System.out.println ("This is how many apples we have" + apples);
        // + -----> plus sign here is not ADDITION.
        // It is called CONCATENATION --- > [KON - KATI - NEYSHIN]

        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);


        System.out.println("I sold some apples - 10 apples sold");
        apples = 30;
        System.out.println("Apples after I sold: " + apples);

        int price = 150;
        System.out.println("The price of my 30 apple is 150"); // Hard coded.
        System.out.println("The price of my " + apples + " apple is " + price);  // Dynamic


    }
}
