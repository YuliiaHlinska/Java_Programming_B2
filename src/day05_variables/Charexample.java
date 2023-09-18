package day05_variables;

public class Charexample {

    public static void main (String [] args){

        // assign characters to the char data type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        //sout

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); // 97 + 90 ---> 187

        char letterThree = 65;
        System.out. println(letterThree); // when we run the code it will be A from unicode table (google)

        //char letterFour = '65': // this is invalid because there are two characters


        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne); //97 + 98 + 65 + 57 + 36 = 345

//concatenation - when we have a string. String its " "
        System.out.println(letterOne +" "+ letterTwo +" "+ letterThree +" "+ numberOne + " " +specialOne); //concatenation

        System.out.println("chars: " + letterOne +" "+ letterTwo +" "+ letterThree +" "+ numberOne + " " +specialOne); //concatenation


//RULE: concatenation starts from FIRST String. Anything after FIRST String is concatenated. So before green "" (String) it will be mathematic desicion.
        System.out.println(letterOne + letterTwo + "chars: " + letterThree + numberOne + specialOne); //concatenation










        //


    }
}
