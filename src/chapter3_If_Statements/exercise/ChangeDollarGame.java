package chapter3_If_Statements.exercise;

import java.util.Scanner;

public class ChangeDollarGame {

    public static void main(String args[]){

        //    You'll ask them how many pennies would you like?
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int penniesAmount = scanner.nextInt();

        //How many nickels would you like?
        System.out.println("How many nickels would you like?");
        int nickelsAmount = scanner.nextInt();
        //How many dimes?
        System.out.println("How many dimes would you like?");
        int dimesAmount = scanner.nextInt();
        //And then, how many quarters?
        System.out.println("How many quarters would you like?");
        int quartersAmount = scanner.nextInt();
        scanner.close();

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;
        //What your program is going to do is count up the value of all of the change that they answered.
        double totalChange = penny * penniesAmount + nickel * nickelsAmount + dime * dimesAmount + quarter * quartersAmount;
        //If it's exactly one dollar then they win the game.
        if (totalChange == dollar){
            System.out.println("Congrats! You won the dollar game!");
        //If it's less than one dollar, tell them how much they went under.
        } else if (totalChange < dollar) {
            double changeShort = dollar - totalChange;
            System.out.println("Sorry! You are $"+ changeShort + "short of a dollar. Try again.");
        //If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
        } else if (totalChange > dollar) {
            double changeOver = totalChange - dollar;
            System.out.println("Sorry! You are $"+ changeOver + " over a dollar. Try again");

        }
    }
}

