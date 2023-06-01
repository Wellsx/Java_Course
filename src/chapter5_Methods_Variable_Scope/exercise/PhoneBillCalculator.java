package chapter5_Methods_Variable_Scope.exercise;

import java.util.Scanner;
/*
Allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over,
and then a 15% tax on the subtotal.
 */
public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //get what we don't know
        double planCost = getPlan();
        double overMinutes = getOverMinutes();
        scanner.close();
        //charge overage
        double totalOver = calculateOver(overMinutes);
        //charge tax
        double totalTax = calculateTax(planCost, totalOver);
        //calculate total
        double total = calculateTotal(planCost, totalOver, totalTax);
        //print total
        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: $" + planCost);
        System.out.println("Overage: $" + totalOver);
        System.out.println("Tax: $" + totalTax);
        System.out.println("Total: $" + total);
    }
    public static double getOverMinutes(){
        System.out.println("Enter your overage minutes:");
        return scanner.nextDouble();
    }
    public static double getPlan(){
        System.out.println("Enter your plan fee:");
        return scanner.nextDouble();
    }
    public static double calculateOver(double overMinutes){
        double overageCost = 0.25;
        return overageCost * overMinutes;
    }
    public static double calculateTax(double planCost, double totalOver){
        double tax = 0.15;
        return (planCost + totalOver) * tax;
    }
    public static double calculateTotal(double planCost, double totalOver, double totalTax){
        return planCost + totalOver + totalTax;
    }
}
