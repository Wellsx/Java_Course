/*
You're going to create an object-oriented coin toss game — this project will consist of three classes.
The first class is Coin.
It should contain a field called side, encapsulation, constant variables for heads and tails, a method called flip(),
which randomly chooses heads or tails and assigns that value to side.

Your second class will be one called Player.
This one will have fields called name and guess.
You'll also have encapsulation in Player, and then add a constructor which accepts a player's name.

Finally, the third class will be one called CoinTossGame — which creates two players.
It asks player 1 to choose heads or tails, and ensures that player 1’s guess is valid.
Don't move on until player 1 actually has a valid guess.
Then, automatically assign player 2’s guess to the opposite of what player 1 chose.
You're going to flip the coin in this class to determine which side it landed on.
Then you're going to determine a winner based on what the coin landed on.
 */
package chapter13_Exceptions.exercise;

import java.util.Scanner;

public class CoinTossGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Player 1 name: ");
        String player1Name = scanner.next();
        Player playerOne = new Player(player1Name);

        System.out.println("Player 2 name: ");
        String player2Name = scanner.next();
        Player playerTwo = new Player(player2Name);

        System.out.println("Heads or Tails?");
        String player1Guess = scanner.next();
        while (!player1Guess.equals(Coin.heads) && !player1Guess.equals(Coin.tails)) {
            System.out.println("Invalid input! Type 'Heads' or 'Tails'.");
            player1Guess = scanner.next();
            playerOne.setGuess(player1Guess);
        }
        scanner.close();

        Coin.flip();
        if (player1Guess.equals(Coin.getSide())) {
            System.out.println("It's " + Coin.getSide() + " " + playerOne.getName() + " wins!");
        } else {
            System.out.println("It's " + Coin.getSide() + " " + playerTwo.getName() + " wins!");
        }


    }

}
