package chapter9_Inheritance.exercise;

public class Cake {
    public String flavor;
    public double price;
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cake(){

    }
    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(14.99);
    }




}
