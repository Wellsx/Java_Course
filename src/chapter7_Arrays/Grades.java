package chapter7_Arrays;

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //assign array length dynamically
        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();
        //string.format % = placeholder .2f = float number 2 decimals
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    public static void getGrades(){
        for (int i=0; i<grades.length; i++){
            //prompt the user then store the grade number in the array
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        //enhanced for loop because values are known
        int sum = 0;
        for (int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighest(){
        //algorithm to iterate through array and assign the highest number to the variable
        int highest = grades[0];
        for (int grade: grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for (int grade: grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
