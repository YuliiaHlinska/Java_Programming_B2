package day07_relational_operators;

import java.sql.SQLOutput;

public class GiftCard {

    /*

            Task:
                declare and assign a gift card with 200
                buy 2 items.
                buy item 1 for x price and subtract from your gift card
                buy item 2 for x price and subtract from your gift card
                print the remaining balance of your gift card

                100
                40

     */

    public static void main(String []arg){

        double giftCardBalance = 200;
        double secondItem = 50;
        System.out.println(" Buy item 1 for $100");
        //* giftCardBalance = giftCardBalance - 100; OR

        giftCardBalance -= 100;

        System.out.println(" Buy item 2 for $ " + secondItem );
        giftCardBalance -= secondItem; // // giftCardBalance = giftCardBalance - secondItem;

        System.out.println("Your gift card balance is now: " + giftCardBalance);






    }
}
