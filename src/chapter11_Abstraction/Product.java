package chapter11_Abstraction;

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    //add default to add a method to interface
        default String getBarcode(){
        return "no barcode";
    }

}
