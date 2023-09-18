package day05_variables;

public class School {

        /*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
    public static void main (String [] arg){
        int numberofstudentsingrade1 = 30;
        int numberofstudentsingrade2 = 40;
        int numberofstudentsingrade3 = 25;
        int numberofstudentsingrade4 = 35;
        int numberofstudentsingrade5 = 50;

        //How can I calculate the total number os students?
        //int Totalnumbersofstudents = 30 + 40 + 25 + 10 = 38;
        int Totalnumbersofstudents = numberofstudentsingrade1 + numberofstudentsingrade2 + numberofstudentsingrade3 + numberofstudentsingrade4 + numberofstudentsingrade5;


        double numberofdaysinayear = 100.5;
        double numberOfSnowDaysInYear = 10;
        double averagegpainschool = 3.5;


        System.out.println("number of students in grade 1: " + numberofstudentsingrade1);
        System.out.println("number of students in grade 2: " + numberofstudentsingrade2);
        System.out.println("number of students in grade 3: " + numberofstudentsingrade3);
        System.out.println("number of students in grade 4: " + numberofstudentsingrade4);
        System.out.println("number of students in grade 5: " + numberofstudentsingrade5);

        System.out.println("Total number of students " + Totalnumbersofstudents); // Answer 180, its sum of everything
        System.out.println ("Total Number of Students " + numberofstudentsingrade1 + numberofstudentsingrade2); //Answer 3040, there are putting two numbers together, Its CONCRETENATE

        System.out.println ("Number od the days in a Year " + numberofdaysinayear); //Answer 100.5

        System.out.println(numberOfSnowDaysInYear); // write variable name (numberofSnowdays..) and then . and SOUT - you will directly see this
        System.out.println("number Of Snow Days In Year = " + numberOfSnowDaysInYear); //write variable name (numberofSnowdays..) and then . and SOUTV - you will directly see this


        System.out.println("average gpa in school = " + averagegpainschool);


    }

}
