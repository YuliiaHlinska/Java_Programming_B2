package day03_comments_escape_sequence;

public class Comments {

    public static void main (String [] args) {

        // THIS is SINGLE LINE COMMENT - It comments everything in that line

        // How do add comments to somebody who we'll read you later

        System.out.println("Loopcamp");



        /*
        This is MULTI LINE COMMENT
                           I can write in multiple Lines
                           And it still not going to be executed - выполнено
                           And also you can make space before line
         */

       System.out.println ("Testing multi Line comment");



        /**
         *
         * This is - Java Doc Comment - similar to multine comment, but this provides extra function for HTML documentation.
         * could be with the stars, but you can delete them
         *
         *
         *
         */
        System.out.println("Loopcamp is going");


        //TODO: I need to fix this code later - reminder to do something later
        //TODO: You can find it in the screen down or "view" and Tool Window, ant it will be there
        System.out.println("Reminder to myself");
    }


}
