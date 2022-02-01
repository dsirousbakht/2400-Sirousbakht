//Daniel Sirousbakht
//CS1400
//Assignment 6
//1 December 2021

/**
    This program accepts an integer which will call the method numberCount
    which will reference the given array using recurison and determine
    how many times the specified integer appears in the given array
 */

import java.util.Scanner; // Needed for the Scanner class

public class TaskA
{
    public static void main(String[] args)
    {
        int[] test = {0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3, 2, 3, 7}; //given array
        int arraySize = 16;     //size of array
        int userInput = 0;      //user's specified integer

        // Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        /*
            Ask the user for the integer which they would like to see how 
            many times it occurs in the given array
        */
        System.out.print("Enter the integer you would like to reference: ");
        userInput = keyboard.nextInt();

        // Closes the scanner object
        keyboard.close();

        // Prints the number of time the user specified integer appears in the array
        System.out.println(numberCount(test, userInput, arraySize));
    }
    
    /*
        Method which uses recursion in order to count the number of times that
        the user's specified integer occurs in the given array
    */
    public static int numberCount(int test[], int userInput, int arraySize)
    {
        if (arraySize == 0)
        {
            return 0;
        }
        else if (userInput != test[arraySize - 1])
        {
            numberCount(test, userInput, arraySize - 1);
        }
        else
        {
            return 1 + numberCount(test, userInput, arraySize - 1);
        }
        return numberCount(test, userInput, arraySize - 1);
    }
}