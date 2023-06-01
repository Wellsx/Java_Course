package chapter3_If_Statements;

import java.util.Scanner;

/*
if statement.
All salespeople get a payment of $1000 a wee.
Salespeople who exceed 10 sales get an additional 250 bonus.
 */
public class SalaryCalculator {

    public static void main(String arg[]){

        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values fo the unknown
        System.out.println("How many sales did the employee make?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //bonus
        if (sales > quota){
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee's pay is $" + salary);
    }
}
