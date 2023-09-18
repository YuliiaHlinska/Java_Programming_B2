package day05_variables;

public class CellPhone {

     /*
        create a class CellPhone
        create a main method
        declare and assign these variables:
            brand, model, color, price, storage, hasCamera, sim(char A, B, C)

        Print all the variables

            sample data: apple, iphone 10, black, 1000.99, 128, true, A
     */

    public static void main (String [] arg) {

        String brand = "Apple";
        String model = " Iphone 13";
        String color = "Blue";
        double price = 999.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from " + brand);
        System.out.println("It case in the color of " + color + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with camera " + hasCamera + ", the tital price was $" + price);

      // поставили /n чтоб начать с новой строки в начале предложенияб которое должно быть на новой строке.
        System.out.println();

        String fullMAssage = "I have an " + model + " from " + brand + "\nIt case in the color of " + color + " and it has " + storage + "GB" + "\nFor the sim type " + sim + " with camera " + hasCamera + ", the tital price was $" + price;

       System.out.println(fullMAssage);










    }
}
