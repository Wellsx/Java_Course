package chapter2_Java_Fundamentals.exercise;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        //asks a user for a season of the year,
        System.out.println("Enter a season.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        // then a whole number,
        System.out.println("Enter a whole number.");
        int number = scanner.nextInt();
        // then an adjective.
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();
        scanner.close();
        // And use the input to complete the sentence below. Output the result.
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");
    }
}
