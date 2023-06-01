package chapter7_Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers(){

        //create new array with constant length 6
        int[] ticket = new int[LENGTH];
        // random number generator
        Random random = new Random();
        // for loop to generate 6 random numbers between 0 and 68 + 1
        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            /*
            Generate random number, then search to mae sure it doesn't exist in the array
            if it does regenerate and search again.
             */
            do {
               randomNumber = random.nextInt(MAX_TICKET_NUMBER)+ 1;
            }while(search(ticket, randomNumber));
            // Number is unique, add it to the array.
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //This is called an enhanced loop. It iterates through array and assigns the current element to 'value'
        for (int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        //if we've reached this point then the entire array was searched
        //and the value was not found
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){

        //array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0) {
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){

        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
