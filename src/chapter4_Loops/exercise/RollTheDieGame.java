package chapter4_Loops.exercise;
/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class RollTheDieGame {

    public static void main(String args[]){

        Random random = new Random();

        int rollAmount = 5;
        int lastSpace = 20;

        int currentSpace = 0;

        for (int i=0; i<rollAmount; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            int totalSpace = lastSpace - currentSpace;
            if (currentSpace > lastSpace){
                System.out.println("You lose! Your score is more than 20.");
                break;
            }
            System.out.println("You've rolled "+ die + " and are now on space " + currentSpace + " and have "
                    + totalSpace + " spaces to go.");
        }
        if (currentSpace == lastSpace){
            System.out.println("Congrats! You've won the game!");
        } else if (currentSpace < lastSpace) {
            System.out.println("You lose! Your score is less than 20.");
        }
    }
}
