package chapter6_Classes_Objects;

public class PhoneBill {

    private int ID;
    private double baseCost;
    private double minutes;
    private double minutesUsed;

    private double totalOverage;
    private double totalTax;
    private double totalBill;

    public PhoneBill(int ID, double baseCost, double minutes, double minutesUsed) {
        setID(ID);
        setBaseCost(baseCost);
        setMinutes(minutes);
        setMinutesUsed(minutesUsed);
        calculateOverage();
        calculateTax();
        calculateTotalBill();
    }

    public PhoneBill(int ID) {
        this(ID, 0.0, 0.0, 0.0);
    }

    public PhoneBill() {
        this(0, 0.0, 0.0, 0.0);
    }

    public int getID() {
        return ID;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public double getTotalOverage() {
        return totalOverage;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public void calculateOverage() {
        if (minutesUsed > minutes) {
            totalOverage = minutesUsed - minutes;
        } else {
            totalOverage = 0.0;
        }
    }

    public void calculateTax() {
        totalTax = baseCost * 0.15;
    }

    public void calculateTotalBill() {
        totalBill = baseCost + totalOverage + totalTax;
    }

    public void printItemizedBill() {
        System.out.println("Phone Bill:");
        System.out.println("ID: " + ID);
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Minutes: " + minutes);
        System.out.println("Minutes Used: " + minutesUsed);
        System.out.println("Overage: " + totalOverage + " minutes");
        System.out.println("Tax: $" + totalTax);
        System.out.println("Total Bill: $" + totalBill);
    }
}
