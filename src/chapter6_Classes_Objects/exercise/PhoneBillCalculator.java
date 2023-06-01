package chapter6_Classes_Objects.exercise;
/*
phone bill should have an ID, a base class,
a number of allotted minutes and a number of minutes used.
And then, it should also be able to calculate the overage,
calculate the tax, and calculate the total.
And then, it should also be able to print an itemized bill.
You should also include three constructors
a default one
one that accepts the ID only
one that accepts all fields
no matter which of these constructors you use, all fields should be set eventually.
 */

import chapter6_Classes_Objects.PhoneBill;

import java.util.Scanner;

public class PhoneBillCalculator {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        PhoneBillCalculator calculator = new PhoneBillCalculator();
        PhoneBill bill = calculator.getBill();
        bill.printItemizedBill();

        calculator.scanner.close();


    }


    public PhoneBill getBill() {
        System.out.println("Enter your phone bill ID:");
        int ID = scanner.nextInt();

        System.out.println("Enter your phone bill cost:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter your minutes:");
        double minutes = scanner.nextDouble();

        System.out.println("Enter your used minutes:");
        double minutesUsed = scanner.nextDouble();

        return new PhoneBill(ID, baseCost, minutes, minutesUsed);
    }


}
