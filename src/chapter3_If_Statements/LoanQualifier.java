package chapter3_If_Statements;

import java.util.Scanner;

/*
NESTED IFS
To qualify for a loan there are two conditions that must be met. The person must make at least $30,000
and they must have also been at their job for 2 or more years.
 */
public class LoanQualifier {

    public static void main(String arg[]){

        //initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get what we dont know
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

        scanner.close();

        //make decision
        if (salary >= requiredSalary){
            if (years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for a loan.");
            }
            else {
                System.out.println("Sorry, you must have worked at your current job "
                +requiredYearsEmployed + " years");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least "
                    + requiredSalary + " to qualify for the loan");
        }
    }
}
