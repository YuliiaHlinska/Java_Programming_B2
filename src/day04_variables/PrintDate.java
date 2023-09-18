package day04_variables;

public class PrintDate {

     /*
        Task:
            declare and assign 3 variables
            the month number, the day number, and year number

            print the date in the following format:
                month/day/year

     */

    public static void main (String [] arg) {

        int month = 9;
        int day = 6; // If you start your numbers with 0, it will NOT show it in output.
        int year = 2023;

        System.out.println (month +"/" + day + "/" + year);
        System.out.println (month +"." + day + "." + year);
        System.out.println (month +"-" + day + "-" + year); // ->> hyphen, dash
        System.out.println (month +"|" + day + "|" + year); // - >> pipeline, vertical bar

    }
}

