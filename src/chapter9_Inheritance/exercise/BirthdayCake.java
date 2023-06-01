package chapter9_Inheritance.exercise;

public class BirthdayCake extends Cake {

    public int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
    public BirthdayCake(){
        super("chocolate");

    }


}
