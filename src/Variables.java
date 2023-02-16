public class Variables {

    public static void main(String[] args) {

        // 1.Declare and initialize a variable of type int called age to a value of 33.
        int age = 33;

        // 2.Print out the variable age using a single println statement.
        System.out.println(age);

        // 3.Declare and initialize a variable of type double called balance to a value of 18.89.
        double balance = 18.89;

        // 4.Declare and initialize a variable of type int called dollars. This variable should be equal to the value of casting the variable
        // balance to an int. That is, if balance is equal to 18.89, dollars will therefore be equal to 18.
        int dollars = (int) balance;

        // 5.Declare and initialize a variable of type int called dollarsRounded. This variable should be equal
        // to the value of casting the variable balance to an int but will round balance to the nearest integer.
        // That is, if balance is equal to 18.89, dollarsRounded will therefore be equal to 19.
        long round = Math.round(balance);
        int dollarsRounded = (int) round;


        // 6.Declare and initialize a variable of type char called letter to a value of A.
        char letter = 'A';

        // 7.Print out the variable letter.
        System.out.println(letter);

        // 8.Cast the variable letter to an integer and print it out. Do this in a single statement.
        System.out.println((int) letter);


        // 9.Increment the variable letter using the postfix increment operator.
        letter++;

        // 10.Print out the variable letter.
        System.out.println(letter);

        // 11.Cast the variable letter to an integer and print it out. Do this in a single statement.
        System.out.println((int) letter);




        // 12.Explain what is happening in questions 6 - 11. Focus your explanation on character data types and integers.
        /**
         * [I have made a char that is 'A' is Q6 and printed it in Q7. I casted 'A' to an integer, 65, in Q8 and printed it.
         * I incremented it in Q9 and printed the new letter in Q10, 'B'. I casted 'B' to an integer, 66, in Q11.]
         */

    }
}
