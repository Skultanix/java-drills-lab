package com.devmountain;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz100();
    }

    private static void fizzBuzz100() {
        //Sets up a for-loop that goes until the counter i gets to 100
        for (int i = 1; i <= 100; i++) {
            //if the modulo of the counter divided by 3 is equal to zero, print "fizz"
            if ((i % 3) == 0)
                System.out.println("fizz");
                //if the modulo of the counter divided by 5 is equal to 0, print "buzz"
            else if ((i % 5) == 0)
                System.out.println("buzz");
                //if the modulo of the counter divide by both 5 and divided by 3 equals 0, print "fizzbuzz", allegedly
            /*The problem is that if statements read from the top down, and looks for the first true condition and
            then will disregard subsequent true conditions. The fix to this would be to put the most stringent condition
            at the top of the if-else block.*/
            else if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else
                System.out.println(i);
        }
        /*There is no reason to use a switch statement for this problem. After nearly an hour of looking for an answer
         because I couldn't figure it out, the best answer I could find used an if statement block to set a variable
         equal to a case number, which beggars the question, "Why even bother with a switch statement when the main
         functionality can only be done in an if statement? Why not just write an if statement?"*/
    }
};