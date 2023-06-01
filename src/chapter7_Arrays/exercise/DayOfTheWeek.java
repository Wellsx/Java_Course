package chapter7_Arrays.exercise;
/*
Make an array that holds its actual values of the days of the week,
and then have the user input a number corresponding to some day of the week.
And assume that the week starts on Monday.
Your program should output the String that represents the day of the week that corresponds
to the number that the user input. For example, if the user inputs the number 1,
your program should print “Monday”.
 */

import java.util.Scanner;

public class DayOfTheWeek {


    private static String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Select a day of the week (1-7):");
        int userInput = scanner.nextInt();

        if (userInput >= 1 && userInput <= 7){
            String selectedDay = weekDay[userInput - 1];
            System.out.println("The day of the week corresponding to your input is: " + selectedDay);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");

        }
        scanner.close();

    }


}
