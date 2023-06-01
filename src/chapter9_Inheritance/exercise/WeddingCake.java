package chapter9_Inheritance.exercise;

public class WeddingCake extends Cake {

    public int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public WeddingCake(){
        super("strawberry");

    }


}
