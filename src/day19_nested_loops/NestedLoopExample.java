package day19_nested_loops;

public class NestedLoopExample {

    public static void main(String[] args) {

        //outer loop
        for (int week = 1; week <= 4; week++) {

            System.out.println("Week: " + week);

            // inner loop
            for ( int day = 1; day <= 7 ; day++) {  // day = 8;
                System.out.println("Day " + day);
            }

            System.out.println();
        }


        System.out.println("-------------------");

// int is out of body, and it became 8 at the end of last circle of inner loop, thats why
// we'll not run "child" the second time, because 8> 7
        int day = 1;
        for (int week = 1; week <= 4; week++) {

            System.out.println("Week: " + week);

            // inner loop
            for ( ; day <= 7 ; day++) {  // day = 8;
                System.out.println("Day " + day);
            }

            System.out.println();
        }

    }
}